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
@Table(name = "`INVOICE`")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InvoiceEntity {
	
	@Id
	@Column(name = "`ID`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "`INVOICE_ID`")
    private String invoiceId;

    @Column(name = "`PURCHASE_ORDER_ID`")
    private String purchaseOrderId;

    @Column(name = "`BUYER_COMPANY_ID`")
    private String buyerCompanyId;

    @Column(name = "`SUPPLIER_COMPANY_ID`")
    private String supplierCompanyId;

    @Column(name = "`INVOICE_NO`")
    private String invoiceNo;

    @Column(name = "`INVOICE_DATE`")
    private String invoiceDate;

    @Column(name = "`INVOICE_DUE_DATE`")
    private String invoiceDueDate;

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
