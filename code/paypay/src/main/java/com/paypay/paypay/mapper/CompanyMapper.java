package com.paypay.paypay.mapper;

import com.paypay.paypay.entity.CompanyEntity;
import com.paypay.paypay.model.dto.CompanyDto;
import com.paypay.paypay.model.request.CreateCompanyRequest;
import com.paypay.paypay.model.request.EditCompanyRequest;

public interface CompanyMapper {

    CompanyDto convertEntityToDto(CompanyEntity input, CompanyDto output);

    CompanyDto convertRequestToDto(CreateCompanyRequest input, CompanyDto output);

    CompanyDto convertRequestToDto(EditCompanyRequest input, CompanyDto output);

    CompanyEntity convertDtoToEntity(CompanyDto input, CompanyEntity output);

}
