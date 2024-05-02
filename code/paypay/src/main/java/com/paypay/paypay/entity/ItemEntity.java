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
@Table(name = "`ITEM`")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemEntity {
	
	@Id
	@Column(name = "`ID`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    @Column(name = "`ITEM_ID`")
    private String itemId;

    @Column(name = "`PURCHASE_ORDER_ID`")
    private String purchaseOrderId;

    @Column(name = "`GOODSRECEIPT_ID`")
    private String goodsReceiptId;

    @Column(name = "`INVOICE_NO`")
    private String invoiceNo;

    @Column(name = "`SUPPLIER_COMPANY_ID`")
    private String supplierCompanyId;

    @Column(name = "`VAT_AMOUNT`")
    private double vatAmount;
    
    @Column(name = "`AMOUNT_BEFORE_VAT`")
    private double amountBeforeVat;

    @Column(name = "`NET_AMOUNT`")
    private double netAmount;
    
    @Column(name = "`ALTERNATIVERECEIVER_FLAG`")
    private String alternativeReceiverFlag;
    
    @Column(name = "`RECEIVER_BANK_CODE`")
    private String receiverBankCode;
    
    @Column(name = "`RECEIVER_BRANCH_BANK_CODE`")
    private String receiverBankBranchCode;
    
    @Column(name = "`RECEIVER_ACCOUNT_NO`")
    private String receiverAccountNo;

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
