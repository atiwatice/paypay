package com.paypay.paypay.mapper;

import org.springframework.stereotype.Service;

import com.paypay.paypay.entity.ItemEntity;
import com.paypay.paypay.model.dto.ItemDto;

@Service
public class ItemMapperImpl implements ItemMapper {

	@Override
	public ItemDto convertEntityToDto(ItemEntity input, ItemDto output) {

		output.setId(input.getId());
		output.setItemId(input.getItemId());
		output.setPurchaseOrderId(input.getPurchaseOrderId());
		output.setGoodsReceiptId(input.getGoodsReceiptId());
		output.setInvoiceNo(input.getInvoiceNo());
		output.setSupplierCompanyId(input.getSupplierCompanyId());
		output.setVatAmount(input.getVatAmount());
		output.setAmountBeforeVat(input.getAmountBeforeVat());
		output.setNetAmount(input.getNetAmount());
		output.setStatus(input.getStatus());
		output.setAlternativeReceiverFlag(input.getAlternativeReceiverFlag());
		output.setReceiverBankCode(input.getReceiverBankCode());
		output.setReceiverBankBranchCode(input.getReceiverBankBranchCode());
		output.setReceiverAccountNo(input.getReceiverAccountNo());
		output.setCreateBy(input.getCreateBy());
		output.setCreateDate(input.getCreateDate());
		output.setUpdateBy(input.getUpdateBy());

		return output;
	}

	@Override
	public ItemEntity convertDtoToEntity(ItemDto input, ItemEntity output) {
		
		output.setId(input.getId());
		output.setItemId(input.getItemId());
		output.setPurchaseOrderId(input.getPurchaseOrderId());
		output.setGoodsReceiptId(input.getGoodsReceiptId());
		output.setInvoiceNo(input.getInvoiceNo());
		output.setSupplierCompanyId(input.getSupplierCompanyId());
		output.setVatAmount(input.getVatAmount());
		output.setAmountBeforeVat(input.getAmountBeforeVat());
		output.setNetAmount(input.getNetAmount());
		output.setStatus(input.getStatus());
		output.setAlternativeReceiverFlag(input.getAlternativeReceiverFlag());
		output.setReceiverBankCode(input.getReceiverBankCode());
		output.setReceiverBankBranchCode(input.getReceiverBankBranchCode());
		output.setReceiverAccountNo(input.getReceiverAccountNo());
		output.setCreateBy(input.getCreateBy());
		output.setCreateDate(input.getCreateDate());
		output.setUpdateBy(input.getUpdateBy());

		return output;
	}

}
