package com.pwi.pwi.model;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Product {

    @Column(nullable = false, updatable = false)
    @Id
    private UUID product_id;
    @Column
    private String product_name;

    @Column
    private String product_size;
    @Column
    private String product_type;

    @ManyToMany
    private List<Inventory> inventory_ids; //a product can be in many inventories

    @OneToOne()
    private Brand brand_id; //a product can belong to one brand


    @Column
    private int stock; //total number of products, present physically
    @Column
    private int aq; //available quantity of products, which can be sold, not including all of physical
    @Column
    private int in_transit; //quantity of products ordered by company A from another company,
    // but not received yet to us
    @Column
    private int moq; //minimum order quantity, this is minimum number
    // of a specific product should be present, before some company orders it
    @Column
    private int qpb; //quantity per box,
    @Column
    private int reorder_point; //if a company's specific product reaches this value

    public Product() {
    }

    public Product(UUID product_id, String product_name, String product_size, String product_type, List<Inventory> inventory_ids, Brand brand_id, int stock, int aq, int in_transit, int moq, int qpb, int reorder_point) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_size = product_size;
        this.product_type = product_type;
        this.inventory_ids = inventory_ids;
        this.brand_id = brand_id;
        this.stock = stock;
        this.aq = aq;
        this.in_transit = in_transit;
        this.moq = moq;
        this.qpb = qpb;
        this.reorder_point = reorder_point;
    }

    //setter
    public void setInventory_ids(List<Inventory> inventory_ids) {
        this.inventory_ids = inventory_ids;
    }

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

    public void setBrand_id(Brand brand_id) {
        this.brand_id = brand_id;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setAq(int aq) {
        this.aq = aq;
    }

    public void setIn_transit(int in_transit) {
        this.in_transit = in_transit;
    }

    public void setMoq(int moq) {
        this.moq = moq;
    }

    public void setQpb(int qpb) {
        this.qpb = qpb;
    }

    public void setReorder_point(int reorder_point) {
        this.reorder_point = reorder_point;
    }

}