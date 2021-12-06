package com.pwi.pwi.service;

import com.pwi.pwi.model.Company;
import com.pwi.pwi.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CompanyServiceImplementation implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;


    public Company saveNewCompany(Company company){
     return companyRepository.save(company);
    }
    public List<Company> getAllCompanies(){
        List<Company> listCompanies = companyRepository.findAll();
        System.out.println(listCompanies);
        return listCompanies;
    } //need to convert before using it
}
