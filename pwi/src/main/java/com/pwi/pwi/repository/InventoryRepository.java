package com.pwi.pwi.repository;

import com.pwi.pwi.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;

import java.util.UUID;

public interface InventoryRepository extends CrudRepository<Inventory, UUID> {

}