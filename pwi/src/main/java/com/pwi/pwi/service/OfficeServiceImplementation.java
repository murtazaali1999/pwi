package com.pwi.pwi.service;
import com.pwi.pwi.model.Office;
import com.pwi.pwi.repository.OfficeRepository;
import com.pwi.pwi.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Component
public class OfficeServiceImplementation implements  OfficeService{

    @Autowired
    private OfficeRepository officeRepository;

    @Override
    public Office newOfficeSave(@RequestBody Office newOffice) {
        System.out.println((Office) newOffice);
        return officeRepository.save(newOffice);
    }

    public List<Office> getOfficeCollection(){
       List<Office> offices = officeRepository.findAll();
       return offices;
    }
}
