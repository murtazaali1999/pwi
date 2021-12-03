package com.pwi.pwi.repository;

import com.pwi.pwi.model.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

import java.util.UUID;

public interface WarehouseRepository extends JpaRepository<Warehouse, UUID> {

}