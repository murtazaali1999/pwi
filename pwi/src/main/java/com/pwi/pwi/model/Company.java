package com.pwi.pwi.model;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Company {

    @Column(nullable = false, updatable = false)
    @GeneratedValue(generator = "UUID")
    @Id
    private UUID company_id;

    @Column
    private String company_name;

    public Company(){

    }

    public Company(UUID company_id, String company_name, List<Office> office_ids) {
        this.company_id = company_id;
        this.company_name = company_name;
    }

    //setters
    public void setCompany_id(UUID company_id) {
        this.company_id = company_id;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    //getters
    public UUID getCompany_id() {
        return company_id;
    }

    public String getCompany_name() {
        return company_name;
    }
}
