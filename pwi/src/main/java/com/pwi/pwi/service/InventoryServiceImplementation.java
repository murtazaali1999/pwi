package com.pwi.pwi.service;

import com.pwi.pwi.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InventoryServiceImplementation implements InventoryService{
    @Autowired
    private InventoryRepository inventoryRepository;
}
