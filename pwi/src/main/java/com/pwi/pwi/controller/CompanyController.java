package com.pwi.pwi.controller;

import com.pwi.pwi.model.Company;
import com.pwi.pwi.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping("/create/new/company")
    public Company createNewCompany(@RequestBody Company company){
       return companyService.saveNewCompany(company);
    }

    @GetMapping("/get/all/company")
    public List<Company> getAllCompany(){return companyService.getAllCompanies();}
}
