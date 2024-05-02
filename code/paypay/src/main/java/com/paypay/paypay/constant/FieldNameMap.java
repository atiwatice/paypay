package com.paypay.paypay.constant;

import java.util.HashMap;
import java.util.Map;

public class FieldNameMap {
    public static final Map<String, String> FIELD_NAMES_MAP = new HashMap<>();
    static {
        // Company Profile
        FIELD_NAMES_MAP.put("companyNameEn", "Company Name Eng");
        FIELD_NAMES_MAP.put("companyNameTh", "Company Name Thai");
        FIELD_NAMES_MAP.put("companyAddress1", "Company Address1");
        FIELD_NAMES_MAP.put("companyAddress2", "Company Address2");
        FIELD_NAMES_MAP.put("companyAddress3", "Company Address3");
        FIELD_NAMES_MAP.put("companyAddress4", "Company Address4");
        FIELD_NAMES_MAP.put("companyTaxId", "Company Tax Id");
        FIELD_NAMES_MAP.put("companyCode", "Company Code");
        FIELD_NAMES_MAP.put("company2WayMatchingFlag", "2 Way Matching Flag");
        FIELD_NAMES_MAP.put("company3WayMatchingFlag", "3 Way Matching Flag");
        FIELD_NAMES_MAP.put("companyIcashCode", "Icash Code");
        FIELD_NAMES_MAP.put("companyIsupplyMode", "Isupply Mode");
        FIELD_NAMES_MAP.put("companyMode", "Company Mode");
        FIELD_NAMES_MAP.put("companyLogo", "Company Logo");

        // Company Branch
        FIELD_NAMES_MAP.put("companyBranchCode", "Company Branch Code");
        FIELD_NAMES_MAP.put("companyBranchName", "Company Branch Name");
        FIELD_NAMES_MAP.put("companyVatBranchCode", "Company Vat Branch Code");
        FIELD_NAMES_MAP.put("companyBranchAddress1", "Company Branch Address1");
        FIELD_NAMES_MAP.put("companyBranchAddress2", "Company Branch Address2");
        FIELD_NAMES_MAP.put("companyBranchAddress3", "Company Branch Address3");
        FIELD_NAMES_MAP.put("companyBranchAddress4", "Company Branch Address4");
        FIELD_NAMES_MAP.put("companyBranchLocationMap", "Company Branch Location Map");

        // Company Profile Contract
        FIELD_NAMES_MAP.put("companyContractFirstName", "Company Contract First Name");
        FIELD_NAMES_MAP.put("companyContractLastName", "Company Contract Last Name");
        FIELD_NAMES_MAP.put("companyContractPhoneNumber", "Company Contract Phone Number");
        FIELD_NAMES_MAP.put("companyContractOfficeNumber", "Company Contract Office Number");
        FIELD_NAMES_MAP.put("companyContractFaxNumber", "Company Contract Fax Number");
        FIELD_NAMES_MAP.put("companyContractEmail", "Company Contract Email");

        // Company Branch Contract
        FIELD_NAMES_MAP.put("companyBranchContractPerson", "Company Branch Contract Person");
        FIELD_NAMES_MAP.put("companyBranchContractFirstName", "Company Branch Contract First Name");
        FIELD_NAMES_MAP.put("companyBranchContractLastName", "Company Branch Contract Last Name");
        FIELD_NAMES_MAP.put("companyBranchContractPhoneNumber", "Company Branch Contract Phone Number");
        FIELD_NAMES_MAP.put("companyBranchContractOfficeNumber", "Company Branch Contract Office Number");
        FIELD_NAMES_MAP.put("companyBranchContractFaxNumber", "Company Branch Contract Fax Number");
        FIELD_NAMES_MAP.put("companyBranchContractEmail", "Company Branch Contract Email");
    }
}
