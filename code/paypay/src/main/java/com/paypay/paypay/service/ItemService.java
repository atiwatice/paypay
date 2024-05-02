package com.paypay.paypay.service;

import com.paypay.paypay.model.dto.ItemDto;
import com.paypay.paypay.model.response.BaseResponse;

public interface ItemService {
	BaseResponse createItem(ItemDto items);

	BaseResponse updateItem(ItemDto itemOld, ItemDto itemNew);
}
