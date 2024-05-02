package com.paypay.paypay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paypay.paypay.entity.PurchaseOrderEntity;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrderEntity, String> {

}
