package com.pwi.pwi.model;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Company {

    @Column(nullable = false, updatable = false)
    @Id
    private UUID company_id;
    @Column
    private String company_name;

    @OneToMany(mappedBy = "company_id")//company to offices
    private List<Office> office_ids;

    public Company() {
    }

    public Company(UUID company_id, String company_name, List<Office> office_ids) {
        this.company_id = company_id;
        this.company_name = company_name;
        this.office_ids = office_ids;
    }

    //setters
    public void setCompany_id(UUID company_id) {
        this.company_id = company_id;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public void setOffice_ids(List<Office> office_ids) {
        this.office_ids = office_ids;
    }

}
