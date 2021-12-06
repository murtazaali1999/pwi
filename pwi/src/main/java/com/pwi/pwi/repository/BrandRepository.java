package com.pwi.pwi.repository;

import com.pwi.pwi.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;
//does all the crud operation for us
public interface BrandRepository extends JpaRepository<Brand, UUID> {

}