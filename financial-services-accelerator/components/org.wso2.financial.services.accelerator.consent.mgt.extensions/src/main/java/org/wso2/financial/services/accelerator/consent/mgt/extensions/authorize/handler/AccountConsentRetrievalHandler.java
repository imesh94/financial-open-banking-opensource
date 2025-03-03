/**
 * Copyright (c) 2025, WSO2 LLC. (https://www.wso2.com).
 * <p>
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 *     http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.financial.services.accelerator.consent.mgt.extensions.authorize.handler;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.wso2.financial.services.accelerator.common.constant.ErrorConstants;
import org.wso2.financial.services.accelerator.common.exception.ConsentManagementException;
import org.wso2.financial.services.accelerator.consent.mgt.dao.models.AuthorizationResource;
import org.wso2.financial.services.accelerator.consent.mgt.dao.models.ConsentMappingResource;
import org.wso2.financial.services.accelerator.consent.mgt.dao.models.ConsentResource;
import org.wso2.financial.services.accelerator.consent.mgt.dao.models.DetailedConsentResource;
import org.wso2.financial.services.accelerator.consent.mgt.extensions.authorize.util.ConsentRetrievalUtil;
import org.wso2.financial.services.accelerator.consent.mgt.extensions.common.ConsentException;
import org.wso2.financial.services.accelerator.consent.mgt.extensions.common.ConsentExtensionConstants;
import org.wso2.financial.services.accelerator.consent.mgt.extensions.common.ResponseStatus;
import org.wso2.financial.services.accelerator.consent.mgt.service.impl.ConsentCoreServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to handle Account Consent data retrieval for Authorize.
 */
public class AccountConsentRetrievalHandler implements ConsentRetrievalHandler {

    private static final Log log = LogFactory.getLog(AccountConsentRetrievalHandler.class);
    ConsentCoreServiceImpl consentCoreService = new ConsentCoreServiceImpl();

    /**
     * Method defined to retrieve the Account consent related data in the authorization flow to send them to the
     * consent page to get PSU consent
     *
     * @param consentResource Consent Resource parameter containing consent related information retrieved from database
     * @return
     * @throws ConsentException
     */
    public JSONArray getConsentDataSet(ConsentResource consentResource)
            throws ConsentException {
        try {
            String receiptString = consentResource.getReceipt();
            Object receiptJSON = new JSONTokener(receiptString).nextValue();

            // Checking whether the request body is in JSON format
            if (!(receiptJSON instanceof JSONObject)) {
                log.error(ErrorConstants.NOT_JSON_OBJECT_ERROR);
                throw new ConsentException(ResponseStatus.INTERNAL_SERVER_ERROR, ErrorConstants.NOT_JSON_OBJECT_ERROR);
            }

            // Checking whether the consent status is valid
            if (!consentResource.getCurrentStatus().equals(ConsentExtensionConstants.AWAIT_AUTHORISE_STATUS) &&
                    !consentResource.getCurrentStatus().equals(ConsentExtensionConstants.AUTHORIZED_STATUS)) {
                log.error(ErrorConstants.STATE_INVALID_ERROR);
                throw new ConsentException(ResponseStatus.BAD_REQUEST, ErrorConstants.STATE_INVALID_ERROR);
            }

            JSONArray consentDataJSON = new JSONArray();
            JSONObject receipt = (JSONObject) receiptJSON;

            // Adding Permissions
            JSONObject data = receipt.getJSONObject(ConsentExtensionConstants.DATA);
            JSONArray permissions = data.getJSONArray(ConsentExtensionConstants.PERMISSIONS);
            JSONObject jsonElementPermissions = new JSONObject();
            jsonElementPermissions.put(ConsentExtensionConstants.TITLE, ConsentExtensionConstants.PERMISSIONS);
            jsonElementPermissions.put(ConsentExtensionConstants.DATA_SIMPLE, permissions);
            consentDataJSON.put(jsonElementPermissions);

            // Adding Expiration Date Time
            if (data.has(ConsentExtensionConstants.EXPIRATION_DATE)) {
                String expiry = data.getString(ConsentExtensionConstants.EXPIRATION_DATE);
                if (!ConsentRetrievalUtil.validateExpiryDateTime(expiry)) {
                    log.error(ErrorConstants.CONSENT_EXPIRED);
                    throw new ConsentException(ResponseStatus.BAD_REQUEST, ErrorConstants.CONSENT_EXPIRED);
                }

                JSONArray expiryArray = new JSONArray();
                expiryArray.put(expiry);

                JSONObject jsonElementExpiry = new JSONObject();
                jsonElementExpiry.put(ConsentExtensionConstants.TITLE, ConsentExtensionConstants.EXPIRATION_DATE_TITLE);
                jsonElementExpiry.put(ConsentExtensionConstants.DATA_SIMPLE, expiryArray);
                consentDataJSON.put(jsonElementExpiry);
            }

            // Adding Transaction From Date Time
            if (data.has(ConsentExtensionConstants.TRANSACTION_FROM_DATE)) {
                String fromDateTime = data.getString(ConsentExtensionConstants.TRANSACTION_FROM_DATE);
                JSONArray fromDateTimeArray = new JSONArray();
                fromDateTimeArray.put(fromDateTime);

                JSONObject jsonElementFromDateTime = new JSONObject();
                jsonElementFromDateTime.put(ConsentExtensionConstants.TITLE, ConsentExtensionConstants.
                        TRANSACTION_FROM_DATE_TITLE);
                jsonElementFromDateTime.put(ConsentExtensionConstants.DATA_SIMPLE, fromDateTimeArray);
                consentDataJSON.put(jsonElementFromDateTime);
            }

            // Adding Transaction To Date Time
            if (data.has(ConsentExtensionConstants.TRANSACTION_TO_DATE)) {
                String toDateTime = data.getString(ConsentExtensionConstants.TRANSACTION_TO_DATE);
                JSONArray toDateTimeArray = new JSONArray();
                toDateTimeArray.put(toDateTime);

                JSONObject jsonElementToDateTime = new JSONObject();
                jsonElementToDateTime.put(ConsentExtensionConstants.TITLE, ConsentExtensionConstants.
                        TRANSACTION_TO_DATE_TITLE);
                jsonElementToDateTime.put(ConsentExtensionConstants.DATA_SIMPLE, toDateTimeArray);
                consentDataJSON.put(jsonElementToDateTime);
            }

            // Adding re-auth data
            JSONObject reAuthData = new JSONObject();
            List<String> accountIdArray = new ArrayList<>();
            if (ConsentExtensionConstants.AUTHORIZED_STATUS.equals(consentResource.getCurrentStatus())) {
                DetailedConsentResource detailedConsentResource = consentCoreService.getDetailedConsent(
                        consentResource.getConsentID());
                reAuthData.put(ConsentExtensionConstants.IS_REAUTHORIZATION, true);
                reAuthData.put(ConsentExtensionConstants.IS_REAUTH_ACCOUNT_UPDATE_ENABLED, true);

                for (ConsentMappingResource consentMapping : detailedConsentResource.getConsentMappingResources()) {
                    accountIdArray.add(consentMapping.getAccountID());
                }
                reAuthData.put(ConsentExtensionConstants.REAUTH_SELECTED_ACCOUNT, new JSONArray(accountIdArray));
            } else {
                reAuthData.put(ConsentExtensionConstants.IS_REAUTHORIZATION, false);
                reAuthData.put(ConsentExtensionConstants.IS_REAUTH_ACCOUNT_UPDATE_ENABLED, false);
                reAuthData.put(ConsentExtensionConstants.REAUTH_SELECTED_ACCOUNT, new JSONArray(accountIdArray));
            }

            JSONArray reAuthArray = new JSONArray();
            reAuthArray.put(reAuthData);

            JSONObject jsonElementReAuth = new JSONObject();
            jsonElementReAuth.put(ConsentExtensionConstants.TITLE, ConsentExtensionConstants.REAUTHORIZATION_TITLE);
            jsonElementReAuth.put(ConsentExtensionConstants.DATA_SIMPLE, reAuthArray);
            consentDataJSON.put(jsonElementReAuth);

            if (log.isDebugEnabled()) {
                String consentData = consentDataJSON.toString().replaceAll("[\r\n]", "");
                log.debug("Returned consent data to get the PSU consent " + consentData);
            }



            return consentDataJSON;
        } catch (ConsentManagementException e) {
            throw new ConsentException(ResponseStatus.INTERNAL_SERVER_ERROR, ErrorConstants.CONSENT_RETRIEVAL_ERROR);
        }
    }

    /**
     * Method defined to validate the authorization status. For re-auth scenarios the auth will be authorised while
     * auth status will be created for other scenarios
     *
     * @param authorizationResource Authorization Resource
     * @param currentStatus         Current Status
     * @return
     */
    public boolean validateAuthorizationStatus(AuthorizationResource authorizationResource, String currentStatus) {

        if (ConsentExtensionConstants.AUTHORIZED_STATUS.equals(currentStatus)) {
            //For Re-Auth scenarios
            return authorizationResource.getAuthorizationStatus().equals(ConsentExtensionConstants.AUTHORIZED_STATUS);
        } else {
            return authorizationResource.getAuthorizationStatus().equals(ConsentExtensionConstants.CREATED_STATUS);
        }
    }

}
