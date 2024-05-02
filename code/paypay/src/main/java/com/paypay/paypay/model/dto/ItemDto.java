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
public class ItemDto {
	
	private Long id;

    private String itemId;

    private String purchaseOrderId;

    private String goodsReceiptId;

    private String invoiceNo;

    private String supplierCompanyId;

    private double vatAmount;
    
    private double amountBeforeVat;

    private double netAmount;
    
    private String alternativeReceiverFlag;
    
    private String receiverBankCode;
    
    private String receiverBankBranchCode;
    
    private String receiverAccountNo;

    private String status;
    
    private String createBy;
    
    private LocalDateTime createDate;
    
    private String updateBy;
}
