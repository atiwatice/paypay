package com.paypay.paypay.service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.paypay.paypay.constant.StatusMap;
import com.paypay.paypay.entity.ItemEntity;
import com.paypay.paypay.mapper.ItemMapper;
import com.paypay.paypay.model.dto.ItemDto;
import com.paypay.paypay.model.response.BaseResponse;
import com.paypay.paypay.repository.ItemRepository;
import com.paypay.paypay.utilities.UtilitiesService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ItemServiceImpl implements ItemService {

	private final ItemRepository itemRepository;
	private final ItemMapper itemMapper;
	private final UtilitiesService utilities;

	public ItemServiceImpl(ItemRepository itemRepository, ItemMapper itemMapper, UtilitiesService utilities) {
		this.itemRepository = itemRepository;
		this.itemMapper = itemMapper;
		this.utilities = utilities;
	}

	@Override
	public BaseResponse createItem(ItemDto itemDto) {
		BaseResponse returnValue = new BaseResponse();
		LocalDateTime localDateTimeNow = utilities.localDateTimeNow();
		ItemEntity itemEntity = new ItemEntity();
		itemMapper.convertDtoToEntity(itemDto, itemEntity);
		itemEntity.setCreateDate(localDateTimeNow);
		try {
			itemRepository.save(itemEntity);
			returnValue.setResponseCode(StatusMap.SUCCUSS_CODE);
			returnValue.setResponseCode(StatusMap.msgMap.get(StatusMap.SUCCUSS_CODE));
			log.info("Item is created success.");

		} catch (Exception e) {
			log.error("Cannot create item.");
			log.error(e.getMessage());
			returnValue.setResponseCode(StatusMap.ERROR_DATABASE);
			returnValue.setResponseCode(StatusMap.msgMap.get(StatusMap.ERROR_DATABASE));
		}

		return returnValue;
	}

	@Override
	public BaseResponse updateItem(ItemDto itemOld, ItemDto itemNew) {
		BaseResponse returnValue = new BaseResponse();
		LocalDateTime localDateTimeNow = utilities.localDateTimeNow();

		ItemEntity itemEntity = new ItemEntity();
		itemMapper.convertDtoToEntity(itemNew, itemEntity);
		itemEntity.setUpdateDate(localDateTimeNow);

		Map<String, String> differences = new HashMap<>();
		utilities.compareObjects(itemOld, itemNew, differences);
		log.info("Item change: " + differences.toString());

		try {
			itemRepository.save(itemEntity);
			returnValue.setResponseCode(StatusMap.SUCCUSS_CODE);
			returnValue.setResponseCode(StatusMap.msgMap.get(StatusMap.SUCCUSS_CODE));
			log.info("Item is updated success.");

		} catch (Exception e) {
			log.error("Cannot update item.");
			log.error(e.getMessage());
			returnValue.setResponseCode(StatusMap.ERROR_DATABASE);
			returnValue.setResponseCode(StatusMap.msgMap.get(StatusMap.ERROR_DATABASE));
		}

		return returnValue;
	}

}
