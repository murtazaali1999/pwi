package com.pwi.pwi.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class Brand {

    @Column(nullable = false, updatable = false)
    @Id
    private UUID brand_id;

    @Column
    private String brand_name;

    public Brand() {
    }

    public boolean getBrand_id(UUID brand_id) {//can be used if it exists in db or not
       return false;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public List<Product> getProduct_ids() {
        return product_ids;
    }

    @OneToMany(mappedBy = "brand_id",targetEntity = Product.class)
    private List<Product> product_ids;

    public Brand(UUID brand_id, String brand_name, List<Product> product_ids) {
        this.brand_id = brand_id;
        this.brand_name = brand_name;
        this.product_ids = product_ids;
    }

    public void setBrand_id(UUID brand_id) {
        this.brand_id = brand_id;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public void setProduct_ids(List<Product> product_ids) {
        this.product_ids = product_ids;
    }

}
