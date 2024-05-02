package com.paypay.paypay.mapper;

import org.springframework.stereotype.Service;

import com.paypay.paypay.entity.CompanyBranchEntity;
import com.paypay.paypay.model.dto.CompanyBranchDto;
import com.paypay.paypay.model.request.CreateCompanyBranchRequest;
import com.paypay.paypay.model.request.EditCompanyBranchRequest;

@Service
public class CompanyBranchMapperImpl implements CompanyBranchMapper {

    @Override
    public CompanyBranchDto convertEntityToDto(CompanyBranchEntity input, CompanyBranchDto output) {
        output.setCompanyId(input.getCompanyId());
        output.setCompanyBranchCode(input.getCompanyBranchId());
        output.setCompanyBranchName(input.getCompanyBranchName());
        output.setCompanyVatBranchCode(input.getCompanyVatBranchCode());
        output.setCompanyBranchAddress1(input.getCompanyBranchAddress1());
        output.setCompanyBranchAddress2(input.getCompanyBranchAddress2());
        output.setCompanyBranchAddress3(input.getCompanyBranchAddress3());
        output.setCompanyBranchAddress4(input.getCompanyBranchAddress4());
        output.setCompanyBranchLocationMap(input.getCompanyBranchLocationMap());
        return output;
    }

    @Override
    public CompanyBranchDto convertRequestToDto(CreateCompanyBranchRequest input,
            CompanyBranchDto output) {
        output.setCompanyId(input.getCompanyId());
        output.setCompanyBranchName(input.getCompanyBranchName());
        output.setCompanyVatBranchCode(input.getCompanyVatBranchCode());
        output.setCompanyBranchAddress1(input.getCompanyBranchAddress1());
        output.setCompanyBranchAddress2(input.getCompanyBranchAddress2());
        output.setCompanyBranchAddress3(input.getCompanyBranchAddress3());
        output.setCompanyBranchAddress4(input.getCompanyBranchAddress4());
        output.setCompanyBranchLocationMap(input.getCompanyBranchLocationMap());
        return output;
    }

    @Override
    public CompanyBranchDto convertRequestToDto(EditCompanyBranchRequest input, CompanyBranchDto output) {
        output.setCompanyId(input.getCompanyId());
        output.setCompanyBranchId(input.getCompanyBranchId());
        output.setCompanyBranchCode(input.getCompanyBranchId());
        output.setCompanyBranchName(input.getCompanyBranchName());
        output.setCompanyVatBranchCode(input.getCompanyVatBranchCode());
        output.setCompanyBranchAddress1(input.getCompanyBranchAddress1());
        output.setCompanyBranchAddress2(input.getCompanyBranchAddress2());
        output.setCompanyBranchAddress3(input.getCompanyBranchAddress3());
        output.setCompanyBranchAddress4(input.getCompanyBranchAddress4());
        output.setCompanyBranchLocationMap(input.getCompanyBranchLocationMap());
        return output;
    }

    @Override
    public CompanyBranchEntity convertDtoToEntity(CompanyBranchDto input, CompanyBranchEntity output) {
        output.setCompanyId(input.getCompanyId());
        output.setCompanyBranchCode(input.getCompanyBranchId());
        output.setCompanyBranchName(input.getCompanyBranchName());
        output.setCompanyVatBranchCode(input.getCompanyVatBranchCode());
        output.setCompanyBranchAddress1(input.getCompanyBranchAddress1());
        output.setCompanyBranchAddress2(input.getCompanyBranchAddress2());
        output.setCompanyBranchAddress3(input.getCompanyBranchAddress3());
        output.setCompanyBranchAddress4(input.getCompanyBranchAddress4());
        output.setCompanyBranchLocationMap(input.getCompanyBranchLocationMap());
        return output;
    }

}
