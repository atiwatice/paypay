package com.paypay.paypay.service;

import com.paypay.paypay.model.request.CreateCompanyBranchRequest;
import com.paypay.paypay.model.request.EditCompanyBranchRequest;
import com.paypay.paypay.model.response.CompanyBranchResponse;

public interface CompanyBranchService {

    public CompanyBranchResponse createCompanyBranch(CreateCompanyBranchRequest req);

    public CompanyBranchResponse editCompanyBranch(EditCompanyBranchRequest req);

}
