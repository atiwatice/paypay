package com.paypay.paypay.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanyBranchDto {

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
