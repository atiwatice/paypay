package com.paypay.paypay.model.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EditCompanyBranchRequest {
    private String companyId;

    private String companyBranchId;

    private String companyBranchCode;

    private String companyBranchName;

    private String companyVatBranchCode;

    private String companyBranchAddress1;

    private String companyBranchAddress2;

    private String companyBranchAddress3;

    private String companyBranchAddress4;

    private String companyBranchLocationMap;
}
