package org.wso2.financial.services.accelerator.common.util;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.wso2.financial.services.accelerator.common.constant.ErrorConstants;

import java.util.UUID;

/**
 * Util class to handle error related operations.
 */
public class ErrorUtils {

    /**
     * Util Method to construct error.
     *
     * @param httpCode
     * @param message
     * @param errorCode
     * @param errorMsg
     * @param path
     * @return
     */
    public static JSONObject constructError(String httpCode, String message, String errorCode, String errorMsg,
                                            String path) {

        String errorId = UUID.randomUUID().toString();
        JSONObject errorObject = new JSONObject();
        JSONArray errorArray = new JSONArray();

        errorArray.put(constructUKErrorObject(errorCode, errorMsg, path));

        errorObject.put(ErrorConstants.CODE, httpCode);
        errorObject.put(ErrorConstants.ID, errorId);
        errorObject.put(ErrorConstants.MESSAGE, message);
        errorObject.put(ErrorConstants.ERRORS, errorArray);

        return errorObject;
    }

    /**
     * Util Method to construct error object in Errors array.
     *
     * @param errorCode
     * @param errorMsg
     * @param path
     * @return
     */
    public static JSONObject constructUKErrorObject(String errorCode, String errorMsg, String path) {

        //ToDo: Get from config
        //String errorURL = OpenBankingUKConfigParser.getInstance().getConsentMgtConfigs().get(
        // ErrorConstants.ERROR_URL);

        String errorURL = "http://error.com";
        JSONObject error = new JSONObject();

        error.put(ErrorConstants.ERROR_CODE, errorCode);
        if (StringUtils.isNotEmpty(errorMsg) && errorMsg.length() > 500) {
            if (errorMsg.contains("is too long")) {
                String[] errorMsgParts = errorMsg.split("is too long");
                errorMsg = StringUtils.left(errorMsgParts[0], 200) + "..." + errorMsgParts[1];
            } else {
                errorMsg = StringUtils.left(errorMsg, 497) + "...";
            }
        }
        error.put(ErrorConstants.MESSAGE, errorMsg);
        if (StringUtils.isNotEmpty(path)) {
            error.put(ErrorConstants.PATH, path);
        }
        if (!errorURL.isEmpty()) {
            error.put(ErrorConstants.URL, errorURL);
        }
        return error;
    }

}
