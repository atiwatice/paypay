package com.paypay.paypay.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "`COMPANY`")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompanyEntity {
	
	@Id
	@Column(name = "`ID`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "`COMPANY_ID`")
    private String companyId;

    @Column(name = "`COMPANY_NAME_EN`")
    private String companyNameEn;

    @Column(name = "`COMPANY_NAME_TH`")
    private String companyNameTh;

    @Column(name = "`COMPANY_ADDRESS1`")
    private String companyAddress1;

    @Column(name = "`COMPANY_ADDRESS2`")
    private String companyAddress2;

    @Column(name = "`COMPANY_ADDRESS3`")
    private String companyAddress3;

    @Column(name = "`COMPANY_ADDRESS4`")
    private String companyAddress4;

    @Column(name = "`COMPANY_TAXID`")
    private String companyTaxId;

    @Column(name = "`COMPANY_CODE`")
    private String companyCode;

    @Column(name = "`COMPANY_2WAY_MATCHING_FLAG`")
    private String company2WayMatchingFlag;

    @Column(name = "`COMPANY_3WAY_MATCHING_FLAG`")
    private String company3WayMatchingFlag;

    @Column(name = "`COMPANY_ICASH_CODE`")
    private String companyIcashCode;

    @Column(name = "`COMPANY_ISUPPLY_MODE`")
    private String companyIsupplyMode;

    @Column(name = "`COMPANY_ISUPPLY_CODE`")
    private String companyIsupplyCode;

    @Column(name = "`COMPANY_MODE`")
    private String companyMode;

    @Column(name = "`COMPANY_LOGO`")
    private byte[] companyLogo;

    @Column(name = "CREATE_DATE")
	private LocalDateTime createDate;

	@Column(name = "CREATE_BY")
	private String createBy;

	@Column(name = "UPDATE_DATE")
	private LocalDateTime updateDate;

	@Column(name = "UPDATE_BY")
	private String updateBy;
}
