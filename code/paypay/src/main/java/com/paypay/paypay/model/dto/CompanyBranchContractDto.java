package com.paypay.paypay.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanyBranchContractDto {

    private String companyBranchId;

    private String companyBranchContractId;

    private String companyBranchContractPerson;

    private String companyBranchContractFirstName;

    private String companyBranchContractLastName;

    private String companyBranchContractPhoneNumber;

    private String companyBranchContractOfficeNumber;

    private String companyBranchContractFaxNumber;

    private String companyBranchContractEmail;
}
