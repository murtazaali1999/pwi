package com.pwi.pwi.repository;

import com.pwi.pwi.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CompanyRepository extends JpaRepository<Company, UUID> {

}