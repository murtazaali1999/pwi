package com.pwi.pwi.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Warehouse {
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    private UUID warehouse_id;

    @ManyToOne//warehouses to office
    private Office office_id; //one office to many warehouses

    @OneToOne(mappedBy = "warehouse_id")
    private Inventory inventory_id; //one warehouse can have one inventory

    public Warehouse(Inventory inventory_id) {
        this.inventory_id = inventory_id;
    }

    //setters
    
    public void setInventory_id(Inventory inventory_id) { this.inventory_id = inventory_id; }
}
