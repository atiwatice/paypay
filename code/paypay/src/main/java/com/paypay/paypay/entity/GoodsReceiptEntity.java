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
@Table(name = "`GOODSRECEIPT`")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GoodsReceiptEntity {
	
	@Id
	@Column(name = "`ID`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "`GOODSRECEIPT_ID`")
    private String goodsReceiptId;

    @Column(name = "`PURCHASE_ORDER_ID`")
    private String purchaseOrderId;

    @Column(name = "`BUYER_COMPANY_ID`")
    private String buyerCompanyId;

    @Column(name = "`SUPPLIER_COMPANY_ID`")
    private String supplierCompanyId;

    @Column(name = "`GR_NO`")
    private String grNo;

    @Column(name = "`GR_DATE`")
    private String grDate;

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
