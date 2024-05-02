package com.paypay.paypay.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.paypay.paypay.model.request.CreateCompanyRequest;
import com.paypay.paypay.model.request.EditCompanyRequest;
import com.paypay.paypay.model.response.CompanyResponse;
import com.paypay.paypay.service.CompanyService;

@RestController
@RequestMapping("/api/company")
public class CompanyController {

    private final CompanyService companyService;


    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping(path = "/createCompany")
    @ResponseStatus(HttpStatus.CREATED)
    public CompanyResponse createCompany(@RequestBody CreateCompanyRequest req) {
        return companyService.createCompany(req);
    }

    @PostMapping(path = "/editCompany")
    @ResponseStatus(HttpStatus.OK)
    public CompanyResponse editCompany(EditCompanyRequest req) {
        return companyService.editCompany(req);
    }

    

}
