package com.paypay.paypay.model.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDto {
    private String companyId;

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

	private LocalDateTime createDate;

	private String createBy;

}
