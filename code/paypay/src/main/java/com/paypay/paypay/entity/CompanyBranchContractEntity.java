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
@Table(name = "`COMPANY_BRANCH_CONTRACT`")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompanyBranchContractEntity {
	
	@Id
	@Column(name = "`ID`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    @Column(name = "`COMPANY_BRANCH_ID`")
    private String companyBranchId;

    @Column(name = "`COMPANY_BRANCH_CONTRACT_ID`")
    private String companyBranchContractId;

    @Column(name = "`COMPANY_BRANCH_CONTRACT_PERSON`")
    private String companyBranchContractPerson;

    @Column(name = "`COMPANY_BRANCH_CONTRACT_FIRST_NAME`")
    private String companyBranchContractFirstName;

    @Column(name = "`COMPANY_BRANCH_CONTRACT_LAST_NAME`")
    private String companyBranchContractLastName;

    @Column(name = "`COMPANY_BRANCH_CONTRACT_PHONE_NUMBER`")
    private String companyBranchContractPhoneNumber;

    @Column(name = "`COMPANY_BRANCH_CONTRACT_OFFICE_NUMBER`")
    private String companyBranchContractOfficeNumber;

    @Column(name = "`COMPANY_BRANCH_CONTRACT_FAX_NUMBER`")
    private String companyBranchContractFaxNumber;

    @Column(name = "`COMPANY_BRANCH_CONTRACT_EMAIL`")
    private String companyBranchContractEmail;

    @Column(name = "CREATE_DATE")
	private LocalDateTime createDate;

	@Column(name = "CREATE_BY")
	private String createBy;

	@Column(name = "UPDATE_DATE")
	private LocalDateTime updateDate;

	@Column(name = "UPDATE_BY")
	private String updateBy;
}
