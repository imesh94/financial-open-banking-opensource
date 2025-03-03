/**
 * Copyright (c) 2024, WSO2 LLC. (https://www.wso2.com).
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

package org.wso2.financial.services.accelerator.common.constant;

/**
 * Error Constant Class.
 */
public class ErrorConstants {

    //Error Response Structure constants
    public static final String CODE = "Code";
    public static final String ID = "Id";
    public static final String ERRORS = "Errors";
    public static final String PATH = "Path";
    public static final String URL = "Url";
    public static final String ERROR = "error";

    //Low level textual error code
    public static final String FIELD_INVALID = "FS.Field.Invalid";
    public static final String FIELD_MISSING = "FS.Field.Missing";
    public static final String RESOURCE_INVALID_FORMAT = "FS.Resource.InvalidFormat";
    public static final String UNSUPPORTED_LOCAL_INSTRUMENTS = "FS.Unsupported.LocalInstrument";
    public static final String PATH_REQUEST_BODY = "Payload.Body";
    public static final String PATH_INSTRUCTED_AMOUNT = "Data.Initiation.InstructedAmount";
    public static final String PATH_CREDIT_ACCOUNT = "Data.Initiation.CreditorAccount";
    public static final String PATH_LOCAL_INSTRUMENT = "Data.Initiation.LocalInstrument";
    public static final String PATH_DEBTOR_ACCOUNT_NAME = "Data.Initiation.DebtorAccount.Name";
    public static final String PATH_DEBTOR_ACCOUNT_IDENTIFICATION = "Data.Initiation.DebtorAccount.Identification";
    public static final String PATH_DEBTOR_ACCOUNT_SCHEME = "Data.Initiation.DebtorAccount.SchemeName";
    public static final String PATH_CREDIT_ACCOUNT_SEC_IDENTIFICATION = "Data.Initiation.CreditorAccount" +
            ".SecondaryIdentification";
    public static final String PATH_CREDIT_ACCOUNT_NAME = "Data.Initiation.CreditorAccount.Name";

    public static final String PATH_CREDIT_ACCOUNT_IDENTIFICATION = "Data.Initiation.CreditorAccount.Identification";
    public static final String PATH_CREDIT_ACCOUNT_SCHEME = "Data.Initiation.CreditorAccount.SchemeName";
    public static final String PATH_INVALID = "Request path invalid";
    public static final String PAYLOAD_INVALID = "Consent validation failed due to invalid initiation payload";
    public static final String NOT_JSON_OBJECT_ERROR = "Payload is not a JSON object";
    public static final String PAYLOAD_FORMAT_ERROR = "Request Payload is not in correct JSON format";
    public static final String PAYLOAD_FORMAT_ERROR_VALID_TO_DATE = "Invalid valid_to_date parameter in the payload" +
            "for valid to date";
    public static final String PAYLOAD_FORMAT_ERROR_DEBTOR_ACC = "Parameter Debtor Account does not exists ";
    public static final String PAYLOAD_FORMAT_ERROR_CREDITOR_ACC = "Parameter Creditor Account " +
            "does not exists ";
    public static final String INVALID_REQ_PAYLOAD = "Invalid request payload";
    public static final String INVALID_REQ_PAYLOAD_INITIATION = "Invalid request payload in initiation key";
    public static final String INVALID_REQ_PAYLOAD_CONTROL_PARAMETERS = "Invalid request payload in " +
            "control parameter key";
    public static final String MISSING_DEBTOR_ACC_SCHEME_NAME = "Mandatory parameter Debtor Account Scheme Name does " +
            "not exists";
    public static final String MISSING_DEBTOR_ACC_IDENTIFICATION = "Mandatory parameter Debtor Account Identification" +
            " does not exists";
    public static final String INVALID_DEBTOR_ACC_SCHEME_NAME = "Debtor Account Scheme Name does not match with the" +
            " Scheme Names defined in the specification";
    public static final String INVALID_DEBTOR_ACC_IDENTIFICATION = "Debtor Account Identification should not exceed" +
            " the max length of 256 characters defined in the specification";
    public static final String INVALID_DEBTOR_ACC_NAME = "Debtor Account Name should not exceed the max length of 70" +
            " character defined in the specification";
    public static final String INVALID_DEBTOR_ACC_SEC_IDENTIFICATION = "Debtor Account Secondary Identification" +
            " should not exceed the max length of 34 characters defined in the specification";
    public static final String NO_CONSENT_FOR_CLIENT_ERROR = "No valid consent found for given information";
    public static final String PAYMENT_INITIATION_HANDLE_ERROR = "Error occurred while handling the payment " +
            "initiation request";
    public static final String MSG_ELAPSED_CUT_OFF_DATE_TIME = "{payment-order} consent / resource received after " +
            "CutOffDateTime.";
    public static final String MAX_INSTRUCTED_AMOUNT = "Instructed Amount specified exceed the Maximum Instructed " +
            "Amount of the bank";
    public static final String INVALID_INSTRUCTED_AMOUNT = "Instructed Amount specified should be grater than zero";
    public static final String MSG_MISSING_CREDITOR_ACC = "Mandatory parameter CreditorAccount is missing in the" +
            " payload.";
    public static final String MISSING_CREDITOR_ACC_SCHEME_NAME = "Mandatory parameter Creditor Account Scheme Name" +
            " does not exists";
    public static final String MISSING_CREDITOR_ACC_IDENTIFICATION = "Mandatory parameter Creditor Account " +
            "Identification does not exists";
    public static final String INVALID_CREDITOR_ACC_SCHEME_NAME = "Creditor Account Scheme Name does not match with" +
            " the Scheme Names defined in the specification";
    public static final String INVALID_CREDITOR_ACC_IDENTIFICATION = "Creditor Account Identification should not " +
            "exceed the max length of 256 characters defined in the specification";
    public static final String INVALID_CREDITOR_ACC_NAME = "Creditor Account Name should not exceed the max length" +
            " of 350 character defined in the specification";
    public static final String INVALID_CREDITOR_ACC_SEC_IDENTIFICATION = "Creditor Account Secondary Identification" +
            " should not exceed the max length of 34 characters defined in the specification";
    public static final String INVALID_IDENTIFICATION = "Identification validation for SortCodeNumber Scheme failed.";
    public static final String INVALID_LOCAL_INSTRUMENT = "The given local instrument value is not supported";
    public static final String INVALID_DEBTOR_ACC_SCHEME_NAME_LENGTH = "Debtor Account Scheme Name length does not " +
            "match with the length defined in the specification";
    public static final String INVALID_CREDITOR_ACC_SCHEME_NAME_LENGTH = "Creditor Account Scheme Name length does" +
            " not match with the length defined in the specification";
    public static final String IDEMPOTENCY_KEY_NOT_FOUND = "Idempotency related details should be submitted" +
            " in order to proceed.";
    public static final String MSG_INVALID_DEBTOR_ACC = "Mandatory parameter DebtorAccount object is invalid.";
    public static final String PATH_DEBTOR_ACCOUNT = "Data.Initiation.DebtorAccount";
    public static final String COF_PATH_DEBTOR_ACCOUNT_SCHEME = "Data.DebtorAccount.SchemeName";
    public static final String COF_PATH_DEBTOR_ACCOUNT_IDENTIFICATION = "Data.DebtorAccount.Identification";
    public static final String COF_PATH_DEBTOR_ACCOUNT_NAME = "Data.DebtorAccount.Name";
    public static final String COF_PATH_DEBTOR_ACCOUNT_SECOND_IDENTIFICATION =
            "Data.DebtorAccount.SecondaryIdentification";
    public static final String PATH_CUTOFF_DATE = "Data.CutOffDateTime";
    public static final String RULES_CUTOFF = "FS.Rules.AfterCutOffDateTime";
    public static final String PATH_CONSENT_ID = "Data.Initiation.Consent-id";
    public static final String PATH_DATA = "Data";
    public static final String PATH_INITIATION = "Data.Initiation";
    public static final String PATH_CONTROL_PARAMETERS = "Data.ControlParameters";
    public static final String PATH_RISK = "Data.Risk";
    public static final String PATH_URL = "Data.Url";
    public static final String PATH_EXPIRATION_DATE = "Data.Expiration-Date";
    public static final String MSG_MISSING_DEBTOR_ACC = "Mandatory parameter DebtorAccount is missing in the payload.";
    public static final String REQUEST_OBJ_EXTRACT_ERROR = "Request object cannot be extracted";
    public static final String REQUEST_OBJ_NOT_SIGNED = "request object is not signed JWT";
    public static final String NOT_JSON_PAYLOAD = "Payload is not a JSON object";
    public static final String INTENT_ID_NOT_FOUND = "intent_id not found in request object";
    public static final String REQUEST_OBJ_PARSE_ERROR = "Error while parsing the request object.";
    public static final String STATE_INVALID_ERROR = "Consent not in authorizable state";
    public static final String DATE_PARSE_MSG = "Parsed OffsetDateTime: %s, current OffsetDateTime: %s";
    public static final String EXP_DATE_PARSE_ERROR = "Error occurred while parsing the expiration date. ";
    public static final String ACC_CONSENT_RETRIEVAL_ERROR = "Error occurred while retrieving the account initiation" +
            " request details";
    public static final String CONSENT_EXPIRED = "Provided consent is expired";
    public static final String CONSENT_RETRIEVAL_ERROR = "Exception occurred while getting consent data";
    public static final String AUTH_CUT_OFF_DATE_ELAPSED = "Cut off time has elapsed";
    public static final String AUTH_TOKEN_REVOKE_ERROR = "Cutoff date time elapsed. Error while revoking the consent.";
    public static final String ACCOUNT_ID_NOT_FOUND_ERROR = "Account IDs not available in persist request";
    public static final String ACCOUNT_ID_FORMAT_ERROR = "Account IDs format error in persist request";
    public static final String RESOURCE_CONSENT_MISMATCH = "FS.Resource.ConsentMismatch";
    public static final String INVALID_USER_ID = "Token received does not bound to the authorized user.:"
            + ErrorConstants.PATH_ACCESS_TOKEN;
    public static final String PATH_ACCESS_TOKEN = "Header.AccessToken";
    public static final String MSG_INVALID_CLIENT_ID = "The client Id related the consent does not match with the " +
            "client id bound to token";
    public static final String PATH_CLIENT_ID = "Header.Client-id";
    public static final String UNEXPECTED_ERROR = "FS.UnexpectedError";
    public static final String INVALID_CONSENT_TYPE = "Invalid Consent Type found in the request";
    public static final String ACCOUNT_CONSENT_STATE_INVALID = "Account validation failed due to invalid consent" +
            " state. :" + ErrorConstants.PATH_STATUS;
    public static final String PATH_STATUS = "Payload.Status";
    public static final String RESOURCE_INVALID_CONSENT_STATUS = "FS.Resource.InvalidConsentStatus";
    public static final String INSTRUCTION_IDENTIFICATION_MISMATCH = "Instruction Identification does not match:"
            + ErrorConstants.PATH_INSTRUCTION_IDENTIFICATION;
    public static final String PATH_INSTRUCTION_IDENTIFICATION = "Data.Initiation.InstructionIdentification";
    public static final String END_TO_END_IDENTIFICATION_MISMATCH = "End to End Identification does not match:"
            + ErrorConstants.PATH_ENDTOEND_IDENTIFICATION;
    public static final String PATH_ENDTOEND_IDENTIFICATION = "Data.Initiation.EndToEndIdentification";
    public static final String END_TO_END_IDENTIFICATION_NOT_FOUND = "End to End Identification isn't present in " +
            "the request or in the consent:" + ErrorConstants.PATH_ENDTOEND_IDENTIFICATION;
    public static final String INSTRUCTED_AMOUNT_AMOUNT_MISMATCH = "Instructed Amount Amount does not match the " +
            "initiated amount:" + ErrorConstants.PATH_INSTRUCTED_AMOUNT_AMOUNT;
    public static final String PATH_INSTRUCTED_AMOUNT_AMOUNT = "Data.Initiation.InstructedAmount.Amount";
    public static final String INSTRUCTED_AMOUNT_AMOUNT_NOT_FOUND = "Instructed Amount  Amount isn't present in the " +
            "payload:";
    public static final String INSTRUCTED_AMOUNT_CURRENCY_MISMATCH = "Instructed Amount currency does not match the " +
            "initiated amount or currency:" + ErrorConstants.PATH_INSTRUCTED_AMOUNT_CURRENCY;
    public static final String PATH_INSTRUCTED_AMOUNT_CURRENCY = "Data.Initiation.InstructedAmount.Currency";
    public static final String INSTRUCTED_AMOUNT_CURRENCY_NOT_FOUND = "Instructed Amount Currency isn't present in " +
            "the payload:";
    public static final String INSTRUCTED_AMOUNT_NOT_FOUND = "Instructed Amount isn't present in the payload";
    public static final String CREDITOR_ACC_SCHEME_NAME_MISMATCH = "Creditor Accounts Scheme does not match";
    public static final String CREDITOR_ACC_SCHEME_NAME_NOT_FOUND = "Creditor Accounts Scheme isn't present in the" +
            " request or in the consent.";
    public static final String CREDITOR_ACC_IDENTIFICATION_MISMATCH = "Creditor Account Identification does not match";
    public static final String CREDITOR_ACC_IDENTIFICATION_NOT_FOUND = "Creditor Account Identification isn't " +
            "present in the request or in the consent.";
    public static final String CREDITOR_ACC_NAME_MISMATCH = "Creditor Account Name does not match";
    public static final String CREDITOR_ACC_SEC_IDENTIFICATION_MISMATCH = "Creditor Account Secondary Identification" +
            " does not match";

    public static final String DEBTOR_ACC_SCHEME_NAME_MISMATCH = "Debtor Account Scheme name does not ";
    public static final String DEBTOR_ACC_SCHEME_NAME_NOT_FOUND = "Debtor Account Scheme name isn't present in the " +
            "request or in the consent";
    public static final String DEBTOR_ACC_IDENTIFICATION_MISMATCH = "Debtor Account Identification does " +
            "not match:";
    public static final String DEBTOR_ACC_IDENTIFICATION_NOT_FOUND = "Debtor Account Identification isn't present " +
            "in the request or in the consent";
    public static final String DEBTOR_ACC_NAME_MISMATCH = "Debtor Account Name does not match";
    public static final String DEBTOR_ACC_SEC_IDENTIFICATION_MISMATCH = "Debtor Account Secondary Identification" +
            " does not match";
    public static final String PATH_DEBTOR_ACCOUNT_SECOND_IDENTIFICATION =
            "Data.Initiation.DebtorAccount.SecondaryIdentification";
    public static final String CREDITOR_ACC_NOT_FOUND = "Creditor Account isn't present in the request.";
    public static final String DEBTOR_ACC_MISMATCH = "Debtor Account mismatch";
    public static final String LOCAL_INSTRUMENT_MISMATCH = "Local Instrument Does Not Match" +
            ErrorConstants.PATH_LOCAL_INSTRUMENT;
    public static final String TOKEN_REVOKE_ERROR = "Token revocation unsuccessful. :" +
            ErrorConstants.PATH_CUTOFF_DATE;
    public static final String CUT_OFF_DATE_ELAPSED = "Cut off time has elapsed :" +
            ErrorConstants.PATH_CUTOFF_DATE;
    public static final String MSG_INVALID_CONSENT_ID = "The requested consent-Id does not match with the consent-Id" +
            " bound to token";
    public static final String PAYMENT_CONSENT_STATE_INVALID = "Payment validation failed due to invalid consent" +
            " state.";
    public static final String VRP_CONSENT_STATUS_INVALID = "Validation failed due to invalid consent status.";
    public static final String DATA_NOT_FOUND = "Data is not found or empty in the request.";
    public static final String INITIATION_NOT_FOUND = "Initiation is not found or is empty in the request.";
    public static final String RISK_MISMATCH = "RISK Does Not Match.";
    public static final String INVALID_URI_ERROR = "Path requested is invalid. :" + ErrorConstants.PATH_URL;
    public static final String COF_CONSENT_STATE_INVALID = "Confirmation of Funds validation failed due to invalid" +
            " consent state.:" + ErrorConstants.PATH_STATUS;
    public static final String CONSENT_EXPIRED_ERROR = "Provided consent is expired. :"
            + ErrorConstants.PATH_EXPIRATION_DATE;
    public static final String MSG_MISSING_CLIENT_ID = "Missing mandatory parameter x-wso2-client-id.";
    public static final String RESOURCE_NOT_FOUND = "FS.Resource.NotFound";
    public static final String ACC_INITIATION_RETRIEVAL_ERROR = "Error occurred while handling the account initiation" +
            " retrieval request";
    public static final String INVALID_CONSENT_ID = "Invalid Consent Id found in the request";
    public static final String CONSENT_ID_NOT_FOUND = "Consent ID not available in consent data";
    public static final String FIELD_INVALID_DATE = "FS.Field.InvalidDate";
    public static final String EXPIRED_DATE_ERROR = "The ExpirationDateTime value has to be a future date.";
    public static final String CONSENT_ATTRIBUTE_RETRIEVAL_ERROR = "Error occurred while retrieving the consent " +
            "attributes";

    // VRP error constants

    public static final String VRP_INITIATION_HANDLE_ERROR = "Error occurred while handling the VRP " +
            "initiation request";
    public static final String VRP_INITIATION_RETRIEVAL_ERROR = "Error occurred while handling the VRP initiation" +
            " retrieval request";
    public static final String PAYLOAD_FORMAT_ERROR_VALID_FROM_DATE = "Request Payload is not in correct JSON format" +
            " for valid from date";
    public static final String INVALID_VALID_TO_DATE_TIME = "Invalid date time format in validToDateTime";
    public static final String INVALID_VALID_FROM_DATE_TIME = "Invalid date time format in validFromDateTime";
    public static final String PAYLOAD_FORMAT_ERROR_CONTROL_PARAMETER = "Request Payload is not in correct JSON " +
            "format for control parameter key";
    public static final String PAYLOAD_FORMAT_ERROR_MAXIMUM_INDIVIDUAL_AMOUNT = "Invalid maximum individual amount";
    public static final String MISSING_MAXIMUM_INDIVIDUAL_AMOUNT = "Missing mandatory parameter Maximum Individual" +
            " Amount";
    public static final String PAYLOAD_FORMAT_ERROR_MAXIMUM_INDIVIDUAL_CURRENCY = "Invalid maximum individual amount" +
            "currency";
    public static final String PAYLOAD_FORMAT_ERROR_INITIATION = "Missing mandatory parameter Initiation" +
            " in the payload";
    public static final String PAYLOAD_FORMAT_ERROR_RISK = "Mandatory parameter Risk does not exists" +
            " in the payload";
    public static final String INVALID_PERIOD_TYPE = "Invalid value for period type in PeriodicLimits";
    public static final String INVALID_PARAMETER = "Parameter passed in is null ";
    public static final String INVALID_CLIENT_ID_MATCH = "Consent validation failed due to client ID mismatch";
    public static final String INVALID_DATE_TIME_FORMAT = "Date and Time is not in correct JSON " +
            "ISO-8601 date-time format";
    public static final String MISSING_DATE_TIME_FORMAT = "The value is empty or the value is not a string";
    public static final String MISSING_VALID_TO_DATE_TIME = "Missing parameter ValidToDateTime";
    public static final String MISSING_VALID_FROM_DATE_TIME = "Missing parameter ValidFromDateTime";
    public static final String INVALID_PARAMETER_PERIODIC_LIMITS = "Parameter passed in is null , " +
            "empty or not a JSONArray";
    public static final String MISSING_PERIOD_LIMITS = "Mandatory parameter " +
            "periodic limits is missing in the payload";
    public static final String MISSING_PERIOD_TYPE = "Missing required parameter Period type";
    public static final String PAYLOAD_FORMAT_ERROR_PERIODIC_LIMITS_PERIOD_TYPE = "Value of period type is empty or " +
            "the value passed in is not a string";
    public static final String PAYLOAD_FORMAT_ERROR_PERIODIC_LIMITS_ALIGNMENT = "Value of periodic alignment is empty" +
            " or the value passed in is not a string";
    public static final String MISSING_PERIOD_ALIGNMENT = "Missing periodic alignment in periodic limits";
    public static final String INVALID_PERIOD_ALIGNMENT = "Invalid value for period alignment in PeriodicLimits";
    public static final String INVALID_PARAMETER_MESSAGE = "Parameter '%s' passed in is null, empty, or not a %s";
    public static final String DATE_INVALID_PARAMETER_MESSAGE = "Invalid date-time range for ValidToDateTime ";
    public static final String INVALID_PERIODIC_LIMIT_SIZE = "Periodic limits exceed the allowed limits";
    public static final String DUPLICATE_PERIOD_TYPE = "Duplicate Period Types found in the request";
    public static final String CURRENCY_MISMATCH = "Currency does not match with the currency of the periodic limits";
    public static final int MAXIMUM_PERIODIC_LIMITS = 6;
    public static final String INVALID_MAXIMUM_INDIVIDUAL_CURRENCY = "Invalid value for Currency in " +
            "MaximumIndividualAmount";
    public static final String INVALID_PERIODIC_LIMIT_AMOUNT = "Invalid value for in Amount in Periodic Limits";
    public static final String INVALID_PERIODIC_LIMIT_CURRENCY = "Invalid value for Currency in Periodic Limits";


    // vrp path parameters
    public static final String PATH_VALID_TO_DATE = "Data.ControlParameters.ValidToDateTime";
    public static final String PATH_VALID_FROM_DATE = "Data.ControlParameters.ValidFromDateTime";
    public static final String PATH_MAXIMUM_INDIVIDUAL_AMOUNT = "Data.ControlParameters.MaximumIndividualAmount";
    public static final String PATH_PERIOD_LIMIT = "Data.ControlParameters.PeriodicLimits";
    public static final String PATH_PERIOD_LIMIT_AMOUNT = "Data.ControlParameters.PeriodicLimits.Amount";
    public static final String PATH_PERIOD_LIMIT_CURRENCY = "Data.ControlParameters.PeriodicLimits.Currency";
    public static final String PATH_PERIOD_TYPE = "Data.ControlParameters.PeriodicLimits.PeriodType";
    public static final String PATH_PERIOD_ALIGNMENT = "Data.ControlParameters.PeriodicLimits.PeriodAlignment";

    // VRP Authorization flow
    public static final String CONTROL_PARAMETERS_MISSING_ERROR = "Missing mandatory parameter the ControlParameters";
    public static final String DATA_OBJECT_MISSING_ERROR = "Missing mandatory parameter the Data";
    public static final String MAX_AMOUNT_NOT_JSON_OBJECT_ERROR = "Parameter Maximum Individual Amount is" +
            "not of type JSONObject";
    public static final String NOT_JSON_ARRAY_ERROR = "Parameter PeriodicLimits is not a JSON Array";
    public static final String PERIOD_ALIGNMENT_NOT_STRING_ERROR = "Parameter Period Alignment is not a String";
    public static final String PERIOD_TYPE_NOT_STRING_ERROR = "Parameter Period Type is not a String";
    public static final String NOT_STRING_ERROR = "Parameter amount or currency is not a String";

    // VRP Submission flow
    public static final String REMITTANCE_INFO_NOT_FOUND = "Remittance info is not present in the request.";
    public static final String INSTRUCTION_IDENTIFICATION_NOT_FOUND = "Instruction Identification isn't present" +
            " in the request";
    public static final String END_TO_END_IDENTIFICATION_PARAMETER_NOT_FOUND = "End to End Identification isn't" +
            " present in the request";
    public static final String RISK_PARAMETER_MISMATCH = "RISK does not match";
    public static final String INSTRUCTED_AMOUNT_PARAMETER_NOT_FOUND = "Instructed Amount isn't present in the payload";
    public static final String INITIATION_REMITTANCE_INFO_PARAMETER_NOT_FOUND = "Remittance ifo present under" +
            " initiation isn't present in the request";
    public static final String INSTRUCTION_REMITTANCE_INFO_PARAMETER_NOT_FOUND = "Remittance ifo present under" +
            " instruction isn't present in the request";
    public static final String REMITTANCE_INFO_MISMATCH = "Remittance info does not match";
    public static final String REMITTANCE_UNSTRUCTURED_MISMATCH = "Remittance Information Unstructured does not " +
            "match";
    public static final String INVALID_SUBMISSION_TYPE = "Value associated with INSTRUCTION_IDENTIFICATION key is " +
            "not a String instance";
    public static final String INVALID_END_TO_END_IDENTIFICATION_TYPE = "Value associated with" +
            " END_TO_END_IDENTIFICATION key is not a String instance";
    public static final String RISK_NOT_FOUND = "Risk is not found or empty in the request.";
    public static final String RISK_NOT_JSON_ERROR = "Risk parameter is not in the correct JSON format";
    public static final String INSTRUCTION_NOT_FOUND = "Instruction is not found or empty in the request.";
    public static final String INVALID_REQUEST_CONSENT_ID = "The consent-Id is not present in the request" +
            " or it is not a String instance or there is a consentId mismatch";
    public static final String INSTRUCTION_CREDITOR_ACC_NOT_JSON_ERROR = "Creditor Account present under instruction" +
            " isn't present in the correct JSON format in the request.";
    public static final String INITIATION_CREDITOR_ACC_NOT_JSON_ERROR = "Creditor Account present under initiation" +
            " isn't present in the correct JSON format in the request.";
    public static final String DEBTOR_ACC_NOT_JSON_ERROR = "Debtor Account isn't present in the correct JSON format " +
            "in the request.";
    public static final String INITIATION_REMITTANCE_INFO_NOT_JSON_ERROR = "Remittance info of initiation is not " +
            "present in the correct JSON format in the request.";
    public static final String INSTRUCTION_REMITTANCE_INFO_NOT_JSON_ERROR = "Remittance info of instruction is not" +
            " present in the correct JSON format in the request.";
    public static final String DEBTOR_ACC_NOT_FOUND = "Debtor Account isn't present in the request.";
    public static final String DATA_NOT_JSON_ERROR = "Data parameter is not in the correct JSON format in the request";
    public static final String INSTRUCTED_AMOUNT_NOT_STRING = "Value associated with Amount key is " +
            "not a String instance";
    public static final String INSTRUCTED_AMOUNT_CURRENCY_NOT_STRING = "Value associated with Currency key is " +
            "not a String instance";
    public static final String INSTRUCTED_AMOUNT_NOT_JSON_ERROR = "Instructed Amount is not in the correct JSON " +
            "format in the request";
    public static final String INITIATION_NOT_JSON = "Initiation is not in the correct JSON " +
            "format in the request";
    public static final String INSTRUCTION_NOT_JSON = "Instruction is not in the correct JSON format in the request";

    //Error Response Structure constants
    public static final String MESSAGE = "Message";
    public static final String ERROR_CODE = "ErrorCode";
    public static final String ERROR_URL = "ErrorURL";
    public static final String ERROR_DESCRIPTION = "error_description";

    //HTTP Error Codes
    public static final String HTTP_BAD_REQUEST = "400";
    public static final String HTTP_UNAUTHORIZED = "401";
    public static final String HTTP_FORBIDDEN = "403";
    public static final String HTTP_NOT_FOUND = "404";
    public static final String HTTP_NOT_ALLOWED = "405";
    public static final String HTTP_NOT_ACCEPTABLE = "406";
    public static final String HTTP_TOO_MANY_REQUESTS = "429";
    public static final String HTTP_SERVER_ERROR = "500";
    public static final String HTTP_CONFLICT = "409";
    public static final String HTTP_UNSUPPORTED_MEDIA_TYPE = "415";

    // High level textual error code, to help categorize the errors.
    public static final String BAD_REQUEST_CODE = "400 BadRequest";
    public static final String UNAUTHORIZED_CODE = "401 Unauthorized";
    public static final String FORBIDDEN_CODE = "403 Forbidden";
    public static final String NOT_FOUND_CODE = "404 Not Found";
    public static final String NOT_ALLOWED_CODE = "405 Method Not Allowed";
    public static final String NOT_ACCEPTABLE_CODE = "406 Not Acceptable";
    public static final String TOO_MANY_REQUESTS_CODE = "429 Too Many Requests";
    public static final String SERVER_ERROR_CODE = "500 Internal Server Error";
    public static final String CONFLICT_CODE = "409 Conflict";
    public static final String UNSUPPORTED_MEDIA_TYPE_CODE = "415 Unsupported Media Type";

    //Low level textual error code
    public static final String FIELD_EXPECTED = "UK.OBIE.Field.Expected";
    public static final String FIELD_UNEXPECTED = "UK.OBIE.Field.Unexpected";
    public static final String HEADER_INVALID = "UK.OBIE.Header.Invalid";
    public static final String HEADER_INVALID_COP = "UK.OBIE.Header";
    public static final String HEADER_MISSING = "UK.OBIE.Header.Missing";
    public static final String JWS_HEADER_MISSING_COP = "UK.OBIE.Signature";
    public static final String RULES_CONTROL_PARAMETERS = "UK.OBIE.Rules.FailsControlParameters";
    public static final String RULES_DUPLICATE_REFERENCE = "UK.OBIE.Rules.DuplicateReference";
    public static final String RULES_RESOURCE_ALREADY_EXISTS = "UK.OBIE.Rules.ResourceAlreadyExists";
    public static final String SIGNATURE_INVALID = "UK.OBIE.Signature.Invalid";
    public static final String SIGNATURE_INVALID_CLAIM = "UK.OBIE.Signature.InvalidClaim";
    public static final String SIGNATURE_MISSING_CLAIM = "UK.OBIE.Signature.MissingClaim";
    public static final String SIGNATURE_MALFORMED = "UK.OBIE.Signature.Malformed";
    public static final String SIGNATURE_MISSING = "UK.OBIE.Signature.Missing";
    public static final String SIGNATURE_UNEXPECTED = "UK.OBIE.Signature.Unexpected";
    public static final String UNSUPPORTED_ACCOUNT_IDENTIFIER = "UK.OBIE.Unsupported.AccountIdentifier";
    public static final String UNSUPPORTED_ACCOUNT_SECONDARY_IDENTIFIER =
            "UK.OBIE.Unsupported.AccountSecondaryIdentifier";
    public static final String UNSUPPORTED_CURRENCY = "UK.OBIE.Unsupported.Currency";
    public static final String UNSUPPORTED_INSTRUCTED_AMOUNT = "UK.OBIE.Unsupported.InstructedAmount";
    public static final String UNSUPPORTED_FREQUENCY = "UK.OBIE.Unsupported.Frequency";
    public static final String UNSUPPORTED_EXECUTION_DATE = "UK.OBIE.Unsupported.RequestedExecutionDate";
    public static final String UNSUPPORTED_SCHEME = "UK.OBIE.Unsupported.Scheme";
    public static final String UNSUPPORTED_PSU_AUTHENTICATION_METHOD = "UK.OBIE.Unsupported.PSUAuthenticationMethods";
    public static final String UNSUPPORTED_VRP_TYPE = "UK.OBIE.Unsupported.VRPType";
    public static final String UNSUPPORTED_EVENT_TYPE = "UK.OBIE.Unsupported.EventType";
    public static final String REAUTHENTICATE = "UK.OBIE.Reauthenticate";

    // Low level textual error code for UK API v4
    public static final String U001 = "U001";
    public static final String U002 = "U002";
    public static final String U003 = "U003";
    public static final String U004 = "U004";
    public static final String U005 = "U005";
    public static final String U006 = "U006";
    public static final String U007 = "U007";
    public static final String U008 = "U008";
    public static final String U009 = "U009";
    public static final String U010 = "U010";
    public static final String U011 = "U011";
    public static final String U012 = "U012";
    public static final String U013 = "U013";
    public static final String U014 = "U014";
    public static final String U015 = "U015";
    public static final String U016 = "U016";
    public static final String U017 = "U017";
    public static final String U018 = "U018";
    public static final String U019 = "U019";
    public static final String U020 = "U020";
    public static final String U021 = "U021";
    public static final String U022 = "U022";
    public static final String U023 = "U023";
    public static final String U024 = "U024";
    public static final String U025 = "U025";
    public static final String U026 = "U026";
    public static final String U027 = "U027";
    public static final String U028 = "U028";
    public static final String U029 = "U029";
    public static final String U000 = "U000";

    //Path of the fields in request
    public static final String PATH_FINANCIAL_ID = "Header.X-fapi-financial-id";
    public static final String PATH_X_FAPI_CUSTOMER_LAST_LOGGED_TIME = "Header.X-fapi-customer-last-logged-time";
    public static final String PATH_X_WSO2_CLIENT_ID = "Header.x-wso2-client-id";
    public static final String PATH_REQUEST_ID = "Header.Consent-id";
    public static final String PATH_USER_ID = "Header.User-id";
    public static final String PATH_ACCOUNT_ID = "Header.Account-ids";
    public static final String PATH_IDEM_KEY = "Header.x-Idempotency-Key";
    public static final String PATH_REQUEST_TIME = "Payload.Time";
    public static final String PATH_PERMISSIONS = "Data.Permissions";
    public static final String PATH_DATE = "Payload.Date";
    public static final String PATH_TRANSACTION_DATE = "Data.TransactionFromDateTime";
    public static final String PATH_TRANSACTION_TO_DATE = "Data.TransactionToDateTime";
    public static final String PATH_LIMIT = "Query.Limit";
    public static final String PATH_OFFSET = "Query.Offset";
    public static final String PATH_QUERY_CONSENT_ID = "Query.ConsentId";
    public static final String PATH_AUTH_STATUS = "Payload.Authorization.Status";
    public static final String PATH_CONSENT_DATA = "Consent.Data";
    public static final String PATH_ACCOUNT_DATA = "Account.Consent-Data";
    public static final String PATH_FREQUENCY = "Data.Initiation.Frequency";
    public static final String PATH_FREQUENCY_API_V4 = "Data.Initiation.MandateRelatedInformation.Frequency";
    public static final String PATH_EXECUTION_DATE = "Data.Initiation.RequestedExecutionDate";
    public static final String PATH_FUNDS_DATA = "Funds.Confirmation.Consent-Data";
    public static final String PATH_COLLECTION_METHOD = "Payload.CollectionMethod";
    public static final String PATH_PAYLOAD_USER_ID = "Payload.UserId";
    public static final String PATH_PAYLOAD_ACCOUNT_ID = "Payload.AccountId";
    public static final String PATH_PAYLOAD_PAYMENT_ID = "Payload.PaymentRequestId";
    public static final String PATH_VERSION = "Data.Version";
    public static final String PATH_REQUEST_PAYLOAD = "Request.Payload";
    public static final String PATH_REQUEST_HEADER = "Request.Header";
    public static final String REQUEST_HEADER = "Request.Header";
    public static final String HEADER_SIGNATURE = "Header.Signature";
    public static final String PATH_INSTRUCTION = "Data.Instruction";
    public static final String PATH_CURRENCY_OF_TRANSFER = "Data.Initiation.CurrencyOfTransfer";
    public static final String PATH_DESTINATION_COUNTRY_CODE = "Data.Initiation.DestinationCountryCode";
    public static final String PATH_FIRST_PAYMENT_DATE_TIME = "Data.Initiation.FirstPaymentDateTime";
    public static final String PATH_FIRST_PAYMENT_DATE_TIME_API_V4 =
            "Data.Initiation.MandateRelatedInformation.FirstPaymentDateTime";
    public static final String PATH_COMPLETION_DATE_TIME = "Data.Authorisation.CompletionDateTime";
    public static final String PATH_DEBTOR_ACCOUNT_PROXY_IDENTIFICATION = "Data.Initiation.DebtorAccount.Proxy" +
            ".Identification";
    public static final String PATH_DEBTOR_ACCOUNT_PROXY_CODE = "Data.Initiation.DebtorAccount.Proxy.Code";
    public static final String PATH_DEBTOR_ACCOUNT_PROXY_TYPE = "Data.Initiation.DebtorAccount.Proxy.Type";
    public static final String PATH_DEBTOR_ACCOUNT_PROXY = "Data.Initiation.DebtorAccount.Proxy";
    public static final String PATH_INSTRUCTION_CREDIT_ACCOUNT = "Data.Instruction.CreditorAccount";
    public static final String PATH_CREDIT_ACCOUNT_PROXY_IDENTIFICATION = "Data.Initiation.CreditorAccount.Proxy" +
            ".Identification";
    public static final String PATH_CREDIT_ACCOUNT_PROXY_CODE = "Data.Initiation.CreditorAccount.Proxy.Code";
    public static final String PATH_CREDIT_ACCOUNT_PROXY_TYPE = "Data.Initiation.CreditorAccount.Proxy.Type";
    public static final String PATH_CREDIT_ACCOUNT_PROXY = "Data.Initiation.CreditorAccount.Proxy";
    public static final String PATH_RISK_PAYMENT_CONTEXT = "Data.Risk.PaymentContextCode";
    public static final String PATH_RISK_MERCHANT_CATEGORY = "Data.Risk.MerchantCategoryCode";
    public static final String PATH_RISK_MERCHANT_CUSTOMER = "Data.Risk.MerchantCustomerIdentification";
    public static final String PATH_RISK_ADDRESS = "Data.Risk.Address";
    public static final String PATH_RISK_COUNTRY = "Data.Risk.Address.Country";
    public static final String PATH_RISK_ADDRESS_STREET_NAME = "Data.Risk.Address.StreetName";
    public static final String PATH_RISK_ADDRESS_BUILDING_NO = "Data.Risk.Address.BuildingNumber";
    public static final String PATH_RISK_ADDRESS_TOWN_NAME = "Data.Risk.Address.TownName";
    public static final String PATH_RISK_ADDRESS_POST_CODE = "Data.Risk.Address.PostCode";
    public static final String PATH_RISK_ADDRESS_COUNTRY_SUB_DIVISION = "Data.Risk.Address.CountrySubDivision";
    public static final String PATH_RISK_ADDRESS_LINE = "Data.Risk.Address.AddressLines";
    public static final String PATH_CREDIT_AGENT = "Data.Initiation.CreditorAgent";
    public static final String PATH_CREDIT_AGENT_NAME = "Data.Initiation.CreditorAgent.SchemeName";
    public static final String PATH_CREDIT_AGENT_IDENTIFICATION = "Data.Initiation.CreditorAgent.Identification";
    public static final String PATH_DEBTOR_AGENT = "Data.Initiation.DebtorAgent";
    public static final String PATH_DEBTOR_AGENT_NAME = "Data.Initiation.DebtorAgent.SchemeName";
    public static final String PATH_DEBTOR_AGENT_IDENTIFICATION = "Data.Initiation.DebtorAgent.Identification";
    public static final String PATH_REMITTANCE_INFO = "Data.Initiation.RemittanceInformation";
    public static final String PATH_REMITTANCE_INFO_REFERENCE = "Data.Initiation.RemittanceInformation.Reference";
    public static final String PATH_REMITTANCE_INFO_UNSTRUCTURED = "Data.Initiation.RemittanceInformation.Unstructured";
    public static final String PATH_REFERENCE = "Data.Initiation.Reference";
    public static final String PATH_FINAL_PAYMENT_DATE_TIME = "Data.Initiation.FinalPaymentDateTime";
    public static final String PATH_FINAL_PAYMENT_DATE_TIME_API_V4 =
            "Data.Initiation.MandateRelatedInformation.FinalPaymentDateTime";
    public static final String PATH_RECURRING_PAYMENT_DATE_TIME = "Data.Initiation.RecurringPaymentDateTime";
    public static final String PATH_RECURRING_PAYMENT_DATE_TIME_API_V4 =
            "Data.Initiation.MandateRelatedInformation.RecurringPaymentDateTime";
    public static final String PATH_CURRENCY = "Data.Initiation.CurrencyOfTransfer";
    public static final String PATH_INSTRUCTION_PRIORITY = "Data.Initiation.InstructionPriority";
    public static final String PATH_EXTENDED_PURPOSE = "Data.Initiation.ExtendedPurpose";
    public static final String PATH_PURPOSE = "Data.Initiation.Purpose";
    public static final String PATH_FIRST_PAYMENT_AMOUNT = "Data.Initiation.FirstPaymentAmount";
    public static final String PATH_FIRST_PAYMENT_AMOUNT_AMOUNT = "Data.Initiation.FirstPaymentAmount.Amount";
    public static final String PATH_FIRST_PAYMENT_CURRENCY = "Data.Initiation.FirstPaymentAmount.Currency";
    public static final String PATH_FINAL_PAYMENT_AMOUNT = "Data.Initiation.FinalPaymentAmount";
    public static final String PATH_FINAL_PAYMENT_AMOUNT_AMOUNT = "Data.Initiation.FinalPaymentAmount.Amount";
    public static final String PATH_FINAL_PAYMENT_CURRENCY = "Data.Initiation.FinalPaymentAmount.Currency";
    public static final String PATH_RECURRING_PAYMENT_AMOUNT = "Data.Initiation.RecurringPaymentAmount";
    public static final String PATH_RECURRING_PAYMENT_AMOUNT_AMOUNT = "Data.Initiation.RecurringPaymentAmount.Amount";
    public static final String PATH_RECURRING_PAYMENT_CURRENCY = "Data.Initiation.RecurringPaymentAmount.Currency";
    public static final String PATH_EXCHANGE_RATE_INFO = "Data.Initiation.ExchangeRateInformation";
    public static final String PATH_EXCHANGE_RATE_UNIT_CURRENCY =
            "Data.Initiation.ExchangeRateInformation.UnitCurrency";
    public static final String PATH_EXCHANGE_RATE = "Data.Initiation.ExchangeRateInformation.ExchangeRate";
    public static final String PATH_EXCHANGE_RATE_TYPE = "Data.Initiation.ExchangeRateInformation.RateType";
    public static final String PATH_EXCHANGE_RATE_IDENTIFICATION =
            "Data.Initiation.ExchangeRateInformation.ContractIdentification";
    public static final String PATH_CREDITOR = "Data.Initiation.Creditor";
    public static final String PATH_CREDITOR_NAME = "Data.Initiation.Creditor.Name";
    public static final String PATH_CREDITOR_ADRESS = "Data.Initiation.Creditor.DeliveryAddress";
    public static final String PATH_HEADER_CONTENT_TYPE = "Header.ContentType";
    public static final String PATH_RESPONSE = "Response.body";
    public static final String PATH_PARAM_CONSENTID = "Consent-id";
    public static final String PATH_FILE_TYPE = "Data.Initiation.FileType";
    public static final String PATH_FILE_HASH = "Data.Initiation.FileHash";
    public static final String PATH_FILE_REFERENCE = "Data.Initiation.FileReference";
    public static final String PATH_FILE_DEBTOR = "Data.Initiation.DebtorAccount";
    public static final String PATH_NO_OF_TXS = "Data.Initiation.NumberOfTransactions";
    public static final String PATH_CONTROL_SUM = "Data.Initiation.ControlSum";
    public static final String PATH_EVENT_TYPES = "Data.EventTypes";
    public static final String PATH_CALLBACK_URL = "Data.CallbackUrl";
    public static final String PATH_SUBSCRIPTION_ID = "Data.EventSubscriptionId";
    public static final String PATH_QUERY_PARAM = "Url.QueryParameters";
    public static final String PATH_CONSENT_AUTH = "Consent.Authorisation";
    public static final String PATH_REQUEST = "Request/Resource";
    public static final String PATH_CREATION_DATE_TIME = "CreationDateTime";
    public static final String PATH_PAYMENT_TYPE = "PaymentType";
    public static final String PATH_FILE = "Data.Initiation.File";
    public static final String PATH_PSU_AUTHENTICATION_METHOD = "Data.ControlParameters.PSUAuthenticationMethods";
    public static final String PATH_VRP_TYPE = "Data.ControlParameters.VRPType";
    public static final String PATH_PERIODIC_LIMITS_AMOUNT = "Data.ControlParameters.PeriodicLimits.Amount";
    public static final String PATH_PERIODIC_LIMITS_CURRENCY = "Data.ControlParameters.PeriodicLimits.Currency";
    public static final String PATH_MAXIMUM_INDIVIDUAL_CURRENCY = "Data.ControlParameters.MaximumIndividualAmount." +
            "Currency";
    public static final String PATH_MANDATE_RELATED_INFORMATION = "Data.Initiation.MandateRelatedInformation";
    public static final String PATH_MANDATE_IDENTIFICATION =
            "Data.Initiation.MandateRelatedInformation.MandateIdentification";
    public static final String PATH_CLASSIFICATION = "Data.Initiation.MandateRelatedInformation.Classification";
    public static final String PATH_CATEGORY_PURPOSE_CODE =
            "Data.Initiation.MandateRelatedInformation.CategoryPurposeCode";
    public static final String PATH_REASON = "Data.Initiation.MandateRelatedInformation.Reason";

    public static final String PATH_ULTIMATE_CREDITOR = "Data.Initiation.UltimateCreditor";
    public static final String PATH_ULTIMATE_CREDITOR_SCHEME_NAME = "Data.Initiation.UltimateCreditor.SchemeName";
    public static final String PATH_ULTIMATE_CREDITOR_IDENTIFICATION =
            "Data.Initiation.UltimateCreditor.Identification";
    public static final String PATH_ULTIMATE_CREDITOR_NAME = "Data.Initiation.UltimateCreditor.Name";
    public static final String PATH_ULTIMATE_CREDITOR_LEI = "Data.Initiation.UltimateCreditor.LEI";
    public static final String PATH_ULTIMATE_CREDITOR_POSTAL_ADDRESS = "Data.Initiation.UltimateCreditor.PostalAddress";
    public static final String PATH_ULTIMATE_DEBTOR = "Data.Initiation.UltimateDebtor";
    public static final String PATH_ULTIMATE_DEBTOR_SCHEME_NAME = "Data.Initiation.UltimateDebtor.SchemeName";
    public static final String PATH_ULTIMATE_DEBTOR_IDENTIFICATION =
            "Data.Initiation.UltimateDebtor.Identification";
    public static final String PATH_ULTIMATE_DEBTOR_NAME = "Data.Initiation.UltimateDebtor.Name";
    public static final String PATH_ULTIMATE_DEBTOR_LEI = "Data.Initiation.UltimateDebtor.LEI";
    public static final String PATH_ULTIMATE_DEBTOR_POSTAL_ADDRESS = "Data.Initiation.UltimateDebtor.PostalAddress";
    public static final String PATH_REGULATORY_REPORTING = "Data.Initiation.RegulatoryReporting";


}

