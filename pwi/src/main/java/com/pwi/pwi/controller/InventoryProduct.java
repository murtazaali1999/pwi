package com.pwi.pwi.controller;

import com.pwi.pwi.model.Inventory;
import com.pwi.pwi.model.Product;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Entity
public class InventoryProduct implements Serializable {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "inventory_id",referencedColumnName = "inventory_id")
    private Inventory inventory_id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id",referencedColumnName = "product_id")
    private Product product_id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InventoryProduct)) return false;
        InventoryProduct that = (InventoryProduct) o;
        return getStock() == that.getStock() && getAq() == that.getAq() && getIn_transit() == that.getIn_transit() && getMoq() == that.getMoq() && getQpb() == that.getQpb() && getReorder_point() == that.getReorder_point() && getId().equals(that.getId()) && getInventory_id().equals(that.getInventory_id()) && getProduct_id().equals(that.getProduct_id());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getInventory_id(), getProduct_id(), getStock(), getAq(), getIn_transit(), getMoq(), getQpb(), getReorder_point());
    }

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


    public InventoryProduct(){

    }

    public InventoryProduct(UUID id, Inventory inventory_id, Product product_id) {
        this.id = id;
        this.inventory_id = inventory_id;
        this.product_id = product_id;
    }

    //Getters
    public Product getProduct_id() {
        return product_id;
    }

    public Inventory getInventory_id() {
        return inventory_id;
    }

    public UUID getId() {
        return id;
    }

    public int getIn_transit() {
        return in_transit;
    }

    public int getMoq() {
        return moq;
    }

    public int getQpb() {
        return qpb;
    }

    public int getReorder_point() {
        return reorder_point;
    }

    public InventoryProduct(UUID id, Inventory inventory_id, Product product_id, int stock, int aq, int in_transit, int moq, int qpb, int reorder_point) {
        this.id = id;
        this.inventory_id = inventory_id;
        this.product_id = product_id;
        this.stock = stock;
        this.aq = aq;
        this.in_transit = in_transit;
        this.moq = moq;
        this.qpb = qpb;
        this.reorder_point = reorder_point;
    }

    public int getStock() {
        return stock;
    }

    public int getAq() {
        return aq;
    }

    //Setters
    public void setId(UUID id) {
        this.id = id;
    }

    public void setInventory_id(Inventory inventory_id) {
        this.inventory_id = inventory_id;
    }

    public void setProduct_id(Product product_id) {
        this.product_id = product_id;
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
