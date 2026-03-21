package com.geointelli.ai.property.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geointelli.ai.property.service.entity.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
