package com.pwi.pwi.controller;

import com.pwi.pwi.model.Inventory;
import com.pwi.pwi.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;
}
