package com.paypay.paypay.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanyContractDto {

    private String companyId;

    private String companyContractId;

    private String companyContractFirstName;

    private String companyContractLastName;

    private String companyContractPhoneNumber;

    private String companyContractOfficeNumber;

    private String companyContractFaxNumber;

    private String companyContractEmail;
}
