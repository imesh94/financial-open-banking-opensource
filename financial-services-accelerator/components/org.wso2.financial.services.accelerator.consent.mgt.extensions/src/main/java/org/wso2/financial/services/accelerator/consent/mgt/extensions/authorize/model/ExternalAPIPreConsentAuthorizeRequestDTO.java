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
package org.wso2.financial.services.accelerator.consent.mgt.extensions.authorize.model;

import org.wso2.financial.services.accelerator.consent.mgt.dao.models.ConsentResource;

/**
 * Wrapper for pre consent authorize flow external request data.
 */
public class ExternalAPIPreConsentAuthorizeRequestDTO {

    private String consentId;
    private String userId;
    private String consentType;
    private String consentStatus;
    private ConsentResource consentResource;

    public ExternalAPIPreConsentAuthorizeRequestDTO(ConsentData consentData) {

        this.consentId = consentData.getConsentId();
        this.userId = consentData.getUserId();
        this.consentType = consentData.getConsentResource().getConsentType();
        this.consentStatus = consentData.getConsentResource().getCurrentStatus();
        this.consentResource = consentData.getConsentResource();
    }

    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getConsentType() {
        return consentType;
    }

    public void setConsentType(String consentType) {
        this.consentType = consentType;
    }

    public String getConsentStatus() {
        return consentStatus;
    }

    public void setConsentStatus(String consentStatus) {
        this.consentStatus = consentStatus;
    }

    public ConsentResource getConsentResource() {
        return consentResource;
    }

    public void setConsentResource(ConsentResource consentResource) {
        this.consentResource = consentResource;
    }
}
