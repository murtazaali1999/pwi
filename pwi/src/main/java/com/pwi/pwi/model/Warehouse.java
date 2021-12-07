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

    public Warehouse() {
    }

    public Warehouse(UUID warehouse_id, Office office_id) {
        this.warehouse_id = warehouse_id;
        this.office_id = office_id;
    }

    //Setters
    public void setWarehouse_id(UUID warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public void setOffice_id(Office office_id) {
        this.office_id = office_id;
    }

    //getters
    public UUID getWarehouse_id() {
        return warehouse_id;
    }

    public Office getOffice_id() {
        return office_id;
    }
}
