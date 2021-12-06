package com.pwi.pwi.service;
import com.pwi.pwi.model.Office;
import com.pwi.pwi.repository.OfficeRepository;
import com.pwi.pwi.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OfficeServiceImplementation implements  OfficeService{

    @Autowired
    private OfficeRepository officeRepository;

    @Override
    public Office newOfficeSave(Office newOffice) {
        return officeRepository.save(newOffice);
    }
}
