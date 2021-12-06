package com.pwi.pwi.service;

import com.pwi.pwi.model.Office;
import com.pwi.pwi.repository.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface OfficeService {

   public Office newOfficeSave(Office newOffice);
}
