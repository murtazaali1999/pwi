package com.pwi.pwi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryProductController {
    @Autowired
    private InventoryProductRepository inventoryProductRepository;
}
