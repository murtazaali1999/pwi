package com.pwi.pwi.controller;

import com.pwi.pwi.model.Company;
import com.pwi.pwi.model.Office;
import com.pwi.pwi.repository.CompanyRepository;
import com.pwi.pwi.repository.OfficeRepository;
import com.pwi.pwi.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OfficeController {

    @Autowired
    private OfficeService officeService;

    @PostMapping("/createNewOffice")
    public Office createNewOffice(
            @RequestBody Office newOffice
    ){
    return officeService.newOfficeSave(newOffice);
    }

    @GetMapping("/get/all/office")
    public List<Office> getAllOffice(){
        return officeService.getOfficeCollection();
    }
}
