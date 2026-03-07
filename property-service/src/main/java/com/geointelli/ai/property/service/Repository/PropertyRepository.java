package com.geointelli.ai.property.service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geointelli.ai.property.service.Entity.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long>{
    
}