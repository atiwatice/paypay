package com.paypay.paypay.mapper;

import org.springframework.stereotype.Service;

import com.paypay.paypay.entity.CompanyEntity;
import com.paypay.paypay.model.dto.CompanyDto;
import com.paypay.paypay.model.request.CreateCompanyRequest;
import com.paypay.paypay.model.request.EditCompanyRequest;

@Service
public class CompanyMapperImpl implements CompanyMapper {

    @Override
    public CompanyDto convertEntityToDto(CompanyEntity input, CompanyDto output) {

        output.setCompanyId(input.getCompanyId());
        output.setCompanyNameEn(input.getCompanyNameEn());
        output.setCompanyNameTh(input.getCompanyNameTh());
        output.setCompanyAddress1(input.getCompanyAddress1());
        output.setCompanyAddress2(input.getCompanyAddress2());
        output.setCompanyAddress3(input.getCompanyAddress3());
        output.setCompanyAddress4(input.getCompanyAddress4());
        output.setCompanyTaxId(input.getCompanyTaxId());
        output.setCompanyCode(input.getCompanyCode());
        output.setCompany2WayMatchingFlag(input.getCompany2WayMatchingFlag());
        output.setCompany3WayMatchingFlag(input.getCompany3WayMatchingFlag());
        output.setCompanyIcashCode(input.getCompanyIcashCode());
        output.setCompanyIsupplyMode(input.getCompanyIsupplyMode());
        output.setCompanyIsupplyCode(input.getCompanyIsupplyCode());
        output.setCompanyMode(input.getCompanyMode());
        output.setCompanyLogo(input.getCompanyLogo());
        output.setCreateBy(input.getCreateBy());
        output.setCreateDate(input.getCreateDate());

        return output;
    }

    @Override
    public CompanyDto convertRequestToDto(CreateCompanyRequest input, CompanyDto output) {

        output.setCompanyNameEn(input.getCompanyNameEn());
        output.setCompanyNameTh(input.getCompanyNameTh());
        output.setCompanyAddress1(input.getCompanyAddress1());
        output.setCompanyAddress2(input.getCompanyAddress2());
        output.setCompanyAddress3(input.getCompanyAddress3());
        output.setCompanyAddress4(input.getCompanyAddress4());
        output.setCompanyTaxId(input.getCompanyTaxId());
        output.setCompanyCode(input.getCompanyCode());
        output.setCompany2WayMatchingFlag(input.getCompany2WayMatchingFlag());
        output.setCompany3WayMatchingFlag(input.getCompany3WayMatchingFlag());
        output.setCompanyIcashCode(input.getCompanyIcashCode());
        output.setCompanyIsupplyMode(input.getCompanyIsupplyMode());
        output.setCompanyIsupplyCode(input.getCompanyIsupplyCode());
        output.setCompanyMode(input.getCompanyMode());
        output.setCompanyLogo(input.getCompanyLogo());

        return output;
    }

    @Override
    public CompanyDto convertRequestToDto(EditCompanyRequest input, CompanyDto output) {

        output.setCompanyId(input.getCompanyId());
        output.setCompanyNameEn(input.getCompanyNameEn());
        output.setCompanyNameTh(input.getCompanyNameTh());
        output.setCompanyAddress1(input.getCompanyAddress1());
        output.setCompanyAddress2(input.getCompanyAddress2());
        output.setCompanyAddress3(input.getCompanyAddress3());
        output.setCompanyAddress4(input.getCompanyAddress4());
        output.setCompanyTaxId(input.getCompanyTaxId());
        output.setCompanyCode(input.getCompanyCode());
        output.setCompany2WayMatchingFlag(input.getCompany2WayMatchingFlag());
        output.setCompany3WayMatchingFlag(input.getCompany3WayMatchingFlag());
        output.setCompanyIcashCode(input.getCompanyIcashCode());
        output.setCompanyIsupplyMode(input.getCompanyIsupplyMode());
        output.setCompanyIsupplyCode(input.getCompanyIsupplyCode());
        output.setCompanyMode(input.getCompanyMode());
        output.setCompanyLogo(input.getCompanyLogo());

        return output;
    }

    @Override
    public CompanyEntity convertDtoToEntity(CompanyDto input, CompanyEntity output) {

        output.setCompanyId(input.getCompanyId());
        output.setCompanyNameEn(input.getCompanyNameEn());
        output.setCompanyNameTh(input.getCompanyNameTh());
        output.setCompanyAddress1(input.getCompanyAddress1());
        output.setCompanyAddress2(input.getCompanyAddress2());
        output.setCompanyAddress3(input.getCompanyAddress3());
        output.setCompanyAddress4(input.getCompanyAddress4());
        output.setCompanyTaxId(input.getCompanyTaxId());
        output.setCompanyCode(input.getCompanyCode());
        output.setCompany2WayMatchingFlag(input.getCompany2WayMatchingFlag());
        output.setCompany3WayMatchingFlag(input.getCompany3WayMatchingFlag());
        output.setCompanyIcashCode(input.getCompanyIcashCode());
        output.setCompanyIsupplyMode(input.getCompanyIsupplyMode());
        output.setCompanyIsupplyCode(input.getCompanyIsupplyCode());
        output.setCompanyMode(input.getCompanyMode());
        output.setCompanyLogo(input.getCompanyLogo());
        output.setCreateBy(input.getCreateBy());
        output.setCreateDate(input.getCreateDate());

        return output;
    }

}
