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
@Table(name = "`COMPANY_BRANCH`")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompanyBranchEntity {
	
	@Id
	@Column(name = "`ID`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    @Column(name = "`COMPANY_ID`")
    private String companyId;

    @Column(name = "`COMPANY_BRANCH_ID`")
    private String companyBranchId;

    @Column(name = "`COMPANY_BRANCH_CODE`")
    private String companyBranchCode;

    @Column(name = "`COMPANY_BRANCH_NAME`")
    private String companyBranchName;

    @Column(name = "`COMPANY_VAT_BRANCH_CODE`")
    private String companyVatBranchCode;

    @Column(name = "`COMPANY_BRANCH_ADDRESS1`")
    private String companyBranchAddress1;

    @Column(name = "`COMPANY_BRANCH_ADDRESS2`")
    private String companyBranchAddress2;

    @Column(name = "`COMPANY_BRANCH_ADDRESS3`")
    private String companyBranchAddress3;

    @Column(name = "`COMPANY_BRANCH_ADDRESS4`")
    private String companyBranchAddress4;

    @Column(name = "`COMPANY_BRANCH_LOCATION_MAP`")
    private String companyBranchLocationMap;

    @Column(name = "CREATE_DATE")
	private LocalDateTime createDate;

	@Column(name = "CREATE_BY")
	private String createBy;

	@Column(name = "UPDATE_DATE")
	private LocalDateTime updateDate;

	@Column(name = "UPDATE_BY")
	private String updateBy;
}
