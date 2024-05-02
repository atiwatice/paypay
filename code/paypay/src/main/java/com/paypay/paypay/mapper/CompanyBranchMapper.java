package com.paypay.paypay.mapper;

import com.paypay.paypay.entity.CompanyBranchEntity;
import com.paypay.paypay.model.dto.CompanyBranchDto;
import com.paypay.paypay.model.request.CreateCompanyBranchRequest;
import com.paypay.paypay.model.request.EditCompanyBranchRequest;

public interface CompanyBranchMapper {
    CompanyBranchDto convertEntityToDto(CompanyBranchEntity input, CompanyBranchDto output);

    CompanyBranchDto convertRequestToDto(CreateCompanyBranchRequest input, CompanyBranchDto output);

    CompanyBranchDto convertRequestToDto(EditCompanyBranchRequest input, CompanyBranchDto output);

    CompanyBranchEntity convertDtoToEntity(CompanyBranchDto input, CompanyBranchEntity output);
}
