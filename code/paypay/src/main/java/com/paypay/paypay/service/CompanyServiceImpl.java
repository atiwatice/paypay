package com.paypay.paypay.service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paypay.paypay.entity.CompanyEntity;
import com.paypay.paypay.mapper.CompanyMapper;
import com.paypay.paypay.model.dto.CompanyDto;
import com.paypay.paypay.model.request.CreateCompanyRequest;
import com.paypay.paypay.model.request.EditCompanyRequest;
import com.paypay.paypay.model.response.CompanyResponse;
import com.paypay.paypay.repository.CompanyRepository;
import com.paypay.paypay.utilities.UtilitiesService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;
    private final UtilitiesService utilities;
    private final CompanyMapper companyMapper;

    public CompanyServiceImpl(CompanyRepository companyRepository, UtilitiesService utilities,
            CompanyMapper companyMapper) {
        this.companyRepository = companyRepository;
        this.utilities = utilities;
        this.companyMapper = companyMapper;
    }

    @Override
    public CompanyResponse createCompany(CreateCompanyRequest req) {
        LocalDateTime localDateTimeNow = utilities.localDateTimeNow();
        String value = req.getCompanyNameEn()
                + utilities.localDateTimeToString(localDateTimeNow, "yyyy-MM-ddHH:mm:ss");
        String companyId = utilities.generateRandomUUID(value);

        CompanyDto companyDto = new CompanyDto();
        companyMapper.convertRequestToDto(req, companyDto);
        companyDto.setCompanyId(companyId);

        CompanyEntity companyEntity = new CompanyEntity();
        companyMapper.convertDtoToEntity(companyDto, companyEntity);
        companyEntity.setCreateDate(localDateTimeNow);
        companyEntity.setCreateBy("SYSTEM");

        CompanyEntity saveToRepoResult = companyRepository.save(companyEntity);
        CompanyResponse response = CompanyResponse.builder().responseCode("00").responseMsg("SUCCESS")
                .companyName(saveToRepoResult.getCompanyNameEn()).build();

        return response;
    }

    @Override
    @Transactional
    public CompanyResponse editCompany(EditCompanyRequest req) {
        LocalDateTime localDateTimeNow = utilities.localDateTimeNow();
        CompanyDto companyDtoReq = new CompanyDto();
        companyMapper.convertRequestToDto(req, companyDtoReq);

        CompanyEntity companyEntity = companyRepository.findByCompanyId(req.getCompanyId());
        CompanyDto companyDtoEntity = new CompanyDto();
        companyMapper.convertEntityToDto(companyEntity, companyDtoEntity);

        companyMapper.convertDtoToEntity(companyDtoReq, companyEntity);
        companyEntity.setUpdateBy("SYSTEM");
        companyEntity.setUpdateDate(localDateTimeNow);

        companyRepository.save(companyEntity);
        
        // Send to No sql
        Map<String, String> differences = new HashMap<>();
        utilities.compareObjects(companyDtoEntity, companyDtoReq, differences);
        log.info("Company profile change: " + differences.toString());

        return CompanyResponse.builder().responseCode("00").responseMsg("Success").companyName(req.getCompanyNameEn())
                .build();
    }

}
