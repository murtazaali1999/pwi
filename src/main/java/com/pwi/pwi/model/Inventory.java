package com.pwi.pwi.model;

import com.pwi.pwi.repository.InventoryRepository;
import net.bytebuddy.build.ToStringPlugin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Inventory {

    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    private UUID inventory_id;

    @ManyToMany
    private List<Product> product_ids;

    @OneToOne//one inventory exists in one warehouse
    private Warehouse warehouse_id;


    public Inventory() {
    }

    public Inventory(UUID inventory_id, List<Product> product_ids, Warehouse warehouse_id) {
        this.inventory_id = inventory_id;
        this.product_ids = product_ids;
        this.warehouse_id = warehouse_id;
    }

    public void setProduct_ids(List<Product> product_ids) {
        this.product_ids = product_ids;
    }

    public void setInventory_id(UUID inventory_id) {
        this.inventory_id = inventory_id;
    }


}
