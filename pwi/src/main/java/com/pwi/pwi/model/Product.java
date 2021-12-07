package com.pwi.pwi.model;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Product {

    @Column(nullable = false, updatable = false)
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID product_id;
    @Column
    private String product_name;

    @OneToOne
    private Brand brand_id;

    @Column
    private String product_size;
    @Column
    private String product_type;


    public Product() {
    }

    public Product(UUID product_id, String product_name, String product_size, String product_type, List<Inventory> inventory_ids, int stock, int aq, int in_transit, int moq, int qpb, int reorder_point) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_size = product_size;
        this.product_type = product_type;
    }

    //setter
    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public void setProduct_size(String product_size) {
        this.product_size = product_size;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public void setProduct_id(UUID product_id) {
        this.product_id = product_id;
    }

}