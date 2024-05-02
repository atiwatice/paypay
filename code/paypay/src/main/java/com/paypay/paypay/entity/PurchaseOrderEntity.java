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
@Table(name = "`PURCHASE_ORDER`")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PurchaseOrderEntity {
	
	@Id
	@Column(name = "`ID`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "`PURCHASE_ORDER_ID`")
    private String purchaseOrderId;

    @Column(name = "`BUYER_COMPANY_ID`")
    private String buyerCompanyId;

    @Column(name = "`PO_NO`")
    private String poNo;

    @Column(name = "`PO_DATE`")
    private String poDate;

    @Column(name = "`PAYMENT_TERM`")
    private String paymentTerm;
    
    @Column(name = "`TOTAL_VAT_AMOUNT`")
    private double totalVatAmount;
    
    @Column(name = "`TOTAL_AMOUNT_BEFORE_VAT`")
    private double totalAmountBeforeVat;
    
    @Column(name = "`TOTAL_NET_AMOUNT`")
    private double totalNetAmount;

    @Column(name = "`STATUS`")
    private String status;

    @Column(name = "CREATE_DATE")
	private LocalDateTime createDate;

	@Column(name = "CREATE_BY")
	private String createBy;

	@Column(name = "UPDATE_DATE")
	private LocalDateTime updateDate;

	@Column(name = "UPDATE_BY")
	private String updateBy;
}
