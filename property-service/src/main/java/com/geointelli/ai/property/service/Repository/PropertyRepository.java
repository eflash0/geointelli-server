package com.geointelli.ai.property.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geointelli.ai.property.service.entity.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long>{
    Property findByFolio(String folio);
}