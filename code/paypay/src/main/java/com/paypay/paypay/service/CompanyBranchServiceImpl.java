package com.paypay.paypay.service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paypay.paypay.entity.CompanyBranchEntity;
import com.paypay.paypay.mapper.CompanyBranchMapper;
import com.paypay.paypay.model.dto.CompanyBranchDto;
import com.paypay.paypay.model.request.CreateCompanyBranchRequest;
import com.paypay.paypay.model.request.EditCompanyBranchRequest;
import com.paypay.paypay.model.response.CompanyBranchResponse;
import com.paypay.paypay.repository.CompanyBranchRepository;
import com.paypay.paypay.utilities.UtilitiesService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CompanyBranchServiceImpl implements CompanyBranchService {

	private final CompanyBranchRepository companyBranchRepository;
	private final UtilitiesService utilities;
	private final CompanyBranchMapper companyBranchMapper;

	public CompanyBranchServiceImpl(CompanyBranchRepository companyBranchRepository, UtilitiesService utilities,
			CompanyBranchMapper companyBranchMapper) {
		this.companyBranchRepository = companyBranchRepository;
		this.utilities = utilities;
		this.companyBranchMapper = companyBranchMapper;
	}

	@Override
	public CompanyBranchResponse createCompanyBranch(CreateCompanyBranchRequest req) {
		LocalDateTime localDateTimeNow = utilities.localDateTimeNow();
		String value = req.getCompanyBranchName()
				+ utilities.localDateTimeToString(localDateTimeNow, "yyyy-MM-ddHH:mm:ss");
		String companyBranchId = utilities.generateRandomUUID(value);

		CompanyBranchDto companyBranchDto = new CompanyBranchDto();
		companyBranchMapper.convertRequestToDto(req, companyBranchDto);
		companyBranchDto.setCompanyBranchId(companyBranchId);

		CompanyBranchEntity companyBranchEntity = new CompanyBranchEntity();
		companyBranchMapper.convertDtoToEntity(companyBranchDto, companyBranchEntity);
		companyBranchEntity.setCreateDate(localDateTimeNow);
		companyBranchEntity.setCreateBy("SYSTEM");

		CompanyBranchEntity saveToRepoResult = companyBranchRepository.save(companyBranchEntity);
		CompanyBranchResponse response = CompanyBranchResponse.builder().responseCode("00").responseMsg("SUCCESS")
				.companyBranchName(saveToRepoResult.getCompanyBranchName()).build();
		return response;
	}

	@Override
	@Transactional
	public CompanyBranchResponse editCompanyBranch(EditCompanyBranchRequest req) {

		LocalDateTime localDateTimeNow = utilities.localDateTimeNow();
		CompanyBranchDto companyBranchDtoReq = new CompanyBranchDto();
		companyBranchMapper.convertRequestToDto(req, companyBranchDtoReq);

		CompanyBranchEntity companyBranchEntity = companyBranchRepository
				.findCompanyBranchBycompanyBranchId(req.getCompanyBranchId());
		CompanyBranchDto companyBranchDtoEntity = new CompanyBranchDto();
		companyBranchMapper.convertEntityToDto(companyBranchEntity, companyBranchDtoEntity);

		companyBranchMapper.convertDtoToEntity(companyBranchDtoReq, companyBranchEntity);
		companyBranchEntity.setUpdateBy("SYSTEM");
		companyBranchEntity.setUpdateDate(localDateTimeNow);

		companyBranchRepository.save(companyBranchEntity);

		Map<String, String> differences = new HashMap<>();
		utilities.compareObjects(companyBranchDtoEntity, companyBranchDtoReq, differences);
		log.info("Company profile change: " + differences.toString());

		return CompanyBranchResponse.builder().responseCode("00").responseMsg("Success")
				.companyBranchName(req.getCompanyBranchName()).build();
	}
}
