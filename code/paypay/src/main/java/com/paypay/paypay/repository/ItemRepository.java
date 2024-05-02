package com.paypay.paypay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.paypay.paypay.entity.ItemEntity;

public interface ItemRepository extends JpaRepository<ItemEntity, String> {

	@Query(value = "select u from ItemEntity u where u.itemId=:itemId and "
			+ "(u.purchaseOrderId=:purchaseOrderId or u.goodsReceiptId=:goodReceiptId)", nativeQuery = true)
	ItemEntity findItemByItemIdAndPurchaseOrderIdOrGoodReceiptId(String itemId, String purchaseOrderId,
			String goodReceiptId);
}
