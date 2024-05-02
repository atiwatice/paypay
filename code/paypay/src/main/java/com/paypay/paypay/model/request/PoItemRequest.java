package com.paypay.paypay.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PoItemRequest {
	
	private String itemId;

	private double vatAmount;
	
	private double amountBeforeVat;

	private double netAmount;
}
