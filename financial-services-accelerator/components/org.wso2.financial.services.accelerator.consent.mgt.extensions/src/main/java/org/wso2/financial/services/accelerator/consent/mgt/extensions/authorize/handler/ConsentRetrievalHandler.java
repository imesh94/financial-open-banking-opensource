/**
 * Copyright (c) 2025, WSO2 LLC. (https://www.wso2.com).
 * <p>
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.financial.services.accelerator.consent.mgt.extensions.authorize.handler;

import org.json.JSONArray;
import org.wso2.financial.services.accelerator.consent.mgt.dao.models.AuthorizationResource;
import org.wso2.financial.services.accelerator.consent.mgt.dao.models.ConsentResource;
import org.wso2.financial.services.accelerator.consent.mgt.extensions.common.ConsentException;

/**
 * Interface to handle Consent data retrieval for Authorize.
 */
public interface ConsentRetrievalHandler {

    /**
     * Abstract method defined to retrieve the consent related data in the authorization flow to send them to the
     * consent page to get PSU consent.
     *
     * @param consentResource Consent Resource parameter containing consent related information retrieved from database
     * @return
     * @throws ConsentException
     */
    JSONArray getConsentDataSet(ConsentResource consentResource) throws ConsentException;

    /**
     * Abstract method defined to validate the authorization status.
     *
     * @param authorizationResource Authorization Resource
     * @param currentStatus         Current Status
     * @return
     */
    boolean validateAuthorizationStatus(AuthorizationResource authorizationResource, String currentStatus);


}
