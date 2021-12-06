package com.pwi.pwi.service;

import com.pwi.pwi.model.Company;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompanyService {
    Company saveNewCompany(Company company);

    List<Company> getAllCompanies();
}
