package com.pwi.pwi.model;


import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Office {

    @Column(nullable = false,updatable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private UUID office_id; //final is constant in java

    @Column
    private String office_location;

    @ManyToOne(cascade = CascadeType.ALL) //offices to company
    private Company company_id; //FK

    public Office() {
    }

    public Office(UUID office_id, String office_location, Company company_id) {
        this.office_id = office_id;
        this.office_location = office_location;
        this.company_id = company_id;
    }

    public void setOffice_id(UUID office_id){
        this.office_id = office_id;
    }

    public void setOffice_location(String office_location) {
        this.office_location = office_location;
    }

    public void setCompany_id(Company company_id) {
        this.company_id = company_id;
    }


    public UUID getOffice_id() {
        return office_id;
    }

    public String getOffice_location() {
        return office_location;
    }

    public Company getCompany_id() {
        return company_id;
    }

}
