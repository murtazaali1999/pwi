package com.pwi.pwi.repository;

import com.pwi.pwi.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface InventoryRepository extends JpaRepository<Brand,UUID> {

}