package com.paypay.paypay.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.paypay.paypay.model.request.CreateCompanyBranchRequest;
import com.paypay.paypay.model.request.EditCompanyBranchRequest;
import com.paypay.paypay.model.response.CompanyBranchResponse;
import com.paypay.paypay.service.CompanyBranchService;

@RestController
@RequestMapping("/api/companyBranch")
public class CompanyBranchController {

	CompanyBranchService companyBranchService;

	public CompanyBranchController(CompanyBranchService companyBranchService) {
		this.companyBranchService = companyBranchService;
	}

	@PostMapping(path = "/createCompanyBranch")
	@ResponseStatus(HttpStatus.CREATED)
	public CompanyBranchResponse createCompanyBranch(@RequestBody CreateCompanyBranchRequest req) {
		return companyBranchService.createCompanyBranch(req);
	}

	@PostMapping(path = "/editCompany")
	@ResponseStatus(HttpStatus.OK)
	public CompanyBranchResponse editCompany(EditCompanyBranchRequest req) {
		return companyBranchService.editCompanyBranch(req);
	}

}
