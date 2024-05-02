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
@Table(name = "`COMPANY_CONTRACT`")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompanyContractEntity {
	
	@Id
	@Column(name = "`ID`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "`COMPANY_ID`")
    private String companyId;

    @Column(name = "`COMPANY_CONTRACT_ID`")
    private String companyContractId;

    @Column(name = "`COMPANY_CONTRACT_FIRST_NAME`")
    private String companyContractFirstName;

    @Column(name = "`COMPANY_CONTRACT_LAST_NAME`")
    private String companyContractLastName;

    @Column(name = "`COMPANY_CONTRACT_PHONE_NUMBER`")
    private String companyContractPhoneNumber;

    @Column(name = "`COMPANY_CONTRACT_OFFICE_NUMBER`")
    private String companyContractOfficeNumber;

    @Column(name = "`COMPANY_CONTRACT_FAX_NUMBER`")
    private String companyContractFaxNumber;

    @Column(name = "`COMPANY_CONTRACT_EMAIL`")
    private String companyContractEmail;

    @Column(name = "CREATE_DATE")
	private LocalDateTime createDate;

	@Column(name = "CREATE_BY")
	private String createBy;

	@Column(name = "UPDATE_DATE")
	private LocalDateTime updateDate;

	@Column(name = "UPDATE_BY")
	private String updateBy;
}
