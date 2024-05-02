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
@Table(name = "`COMPANY_RELATION`")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompanyRelationEntity {
	
	@Id
	@Column(name = "`ID`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "`COMPANY_RELATION_ID`")
    private String companyRelationId;

    @Column(name = "`COMPANY_ID_A`")
    private String companyIdA;

    @Column(name = "`COMPANY_TAX_A`")
    private String companyTaxA;

    @Column(name = "`COMPANY_NAME_TH_A`")
    private String companyNameThA;

    @Column(name = "`COMPANY_NAME_EN_A`")
    private String companyNameEnA;

    @Column(name = "`COMPANY_ID_B`")
    private String companyIdB;

    @Column(name = "`COMPANY_TAX_B`")
    private String companyTaxB;

    @Column(name = "`COMPANY_NAME_TH_B`")
    private String companyNameThB;

    @Column(name = "`COMPANY_NAME_EN_B`")
    private String companyNameEnB;

    @Column(name = "`COMPANY_RELATION_STATUS`")
    private String relationStatus;

    @Column(name = "CREATE_DATE")
	private LocalDateTime createDate;

	@Column(name = "CREATE_BY")
	private String createBy;

	@Column(name = "UPDATE_DATE")
	private LocalDateTime updateDate;

	@Column(name = "UPDATE_BY")
	private String updateBy;
}
