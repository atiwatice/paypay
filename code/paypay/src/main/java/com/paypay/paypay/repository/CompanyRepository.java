package com.paypay.paypay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paypay.paypay.entity.CompanyEntity;


public interface CompanyRepository extends JpaRepository<CompanyEntity, String> {
    CompanyEntity findByCompanyId(String companyId);
}
