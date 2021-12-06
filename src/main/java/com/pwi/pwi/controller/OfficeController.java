package com.pwi.pwi.controller;

import com.pwi.pwi.model.Company;
import com.pwi.pwi.model.Office;
import com.pwi.pwi.repository.CompanyRepository;
import com.pwi.pwi.repository.OfficeRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class OfficeController {

    private String return_message;
    private OfficeRepository officeRepository;
    private CompanyRepository companyRepository;

    @PostMapping("/createNewOffice")
    public String createNewOffice(
            @RequestBody Office newOffice
    ){
        final Office n_office = newOffice;
        if(n_office==null) {
            return_message = "one of the field is empty";
            return return_message;
        }
        Company l_company;

        return null;
    }
}
