package com.paypay.paypay.mapper;

import com.paypay.paypay.entity.ItemEntity;
import com.paypay.paypay.model.dto.ItemDto;

public interface ItemMapper {
	ItemDto convertEntityToDto(ItemEntity input, ItemDto output);
	ItemEntity convertDtoToEntity(ItemDto input, ItemEntity output);
}
