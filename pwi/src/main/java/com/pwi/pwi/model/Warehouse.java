package com.pwi.pwi.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Warehouse {
    @Column(nullable = false, updatable = false)
    @Id
    private UUID warehouse_id;

    @ManyToOne//warehouses to office
    private Office office_id; //one office to many warehouses

    @OneToOne(mappedBy = "warehouse_id")
    private Inventory inventory_id; //one warehouse can have one inventory

    public Warehouse() {
    }

    public Warehouse(Inventory inventory_id) {
        this.inventory_id = inventory_id;
    }

    //setters
    public void setWarehouse_id(UUID warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public void setOffice_id(Office office_id) {
        this.office_id = office_id;
    }

    public void setInventory_id(Inventory inventory_id) { this.inventory_id = inventory_id; }
}
