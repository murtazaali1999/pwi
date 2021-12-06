package com.pwi.pwi.repository;

import com.pwi.pwi.model.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;

import java.util.UUID;
//does all the crud operation for us
public interface BrandRepository extends CrudRepository<Brand, UUID> {

}