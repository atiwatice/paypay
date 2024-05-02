package com.paypay.paypay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paypay.paypay.entity.CompanyBranchEntity;

public interface CompanyBranchRepository extends JpaRepository<CompanyBranchEntity, String> {
	CompanyBranchEntity findCompanyBranchBycompanyBranchId(String companyBranchId);
}
