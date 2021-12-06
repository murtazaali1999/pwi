package com.pwi.pwi.repository;

import com.pwi.pwi.model.Company;
import com.pwi.pwi.model.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;

import java.util.UUID;

public interface OfficeRepository extends CrudRepository<Office, UUID> {

}