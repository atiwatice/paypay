package com.paypay.paypay.model.request;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseOrderRequest {

	private String poNo;

	private String poDate;

	private String buyerTaxId;

	private String buyerVatBranchCode;
	
	private String buyerBranchCode;
	
	private double totalVatAmount;
	
    private double totalAmountBeforeVat;
    
    private double totalNetAmount;
    
    private List<PoItemRequest> item;
	
	

}
