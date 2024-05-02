package com.paypay.paypay.service;

import com.paypay.paypay.model.request.CreateCompanyRequest;
import com.paypay.paypay.model.request.EditCompanyRequest;
import com.paypay.paypay.model.response.CompanyResponse;

public interface CompanyService {

    public CompanyResponse createCompany(CreateCompanyRequest req);

    public CompanyResponse editCompany(EditCompanyRequest req);

}
