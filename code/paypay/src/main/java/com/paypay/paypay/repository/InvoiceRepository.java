package com.paypay.paypay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paypay.paypay.entity.InvoiceEntity;

public interface InvoiceRepository extends JpaRepository<InvoiceEntity, String> {
    
}
