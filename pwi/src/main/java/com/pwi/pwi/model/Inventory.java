package com.pwi.pwi.model;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Inventory {

    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    private UUID inventory_id;

    @OneToOne//one inventory exists in one warehouse
    private Warehouse warehouse_id;

    public Inventory() {
    }

    public Inventory(UUID inventory_id, Warehouse warehouse_id) {
        this.inventory_id = inventory_id;
        this.warehouse_id = warehouse_id;
    }

    //setters
    public void setWarehouse_id(Warehouse warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public void setInventory_id(UUID inventory_id) {
        this.inventory_id = inventory_id;
    }

    //getters
    public UUID getInventory_id() {
        return inventory_id;
    }

    public Warehouse getWarehouse_id() {
        return warehouse_id;
    }

}
