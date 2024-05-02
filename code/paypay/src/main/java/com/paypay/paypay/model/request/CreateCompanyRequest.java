package com.paypay.paypay.model.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateCompanyRequest {

    private String companyNameEn;

    private String companyNameTh;

    private String companyAddress1;

    private String companyAddress2;

    private String companyAddress3;

    private String companyAddress4;

    private String companyTaxId;

    private String companyCode;

    private String company2WayMatchingFlag;

    private String company3WayMatchingFlag;

    private String companyIcashCode;

    private String companyIsupplyMode;

    private String companyIsupplyCode;

    private String companyMode;

    private byte[] companyLogo;
}
