package com.pwi.pwi.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface InventoryProductRepository extends JpaRepository<InventoryProduct,UUID> {
}
