package com.pwi.pwi.model;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Inventory {

    @GeneratedValue(generator = "UUID")
    @Id
    private UUID inventory_id;

    @OneToOne//one inventory exists in one warehouse
    private Warehouse warehouse_id;

    public Inventory(UUID inventory_id, Warehouse warehouse_id) {
        this.inventory_id = inventory_id;
        this.warehouse_id = warehouse_id;
    }

    public Inventory() {}

    //setters
    public void setWarehouse_id(Warehouse warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public void setInventory_id(UUID inventory_id) {
        this.inventory_id = inventory_id;
    }

    //getters
    public UUID getInventory_id() { return inventory_id; }

    public Warehouse getWarehouse_id() { return warehouse_id; }

}
