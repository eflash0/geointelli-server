package com.geointelli.ai.property.service.service.impl;

import org.springframework.stereotype.Service;

import com.geointelli.ai.property.service.entity.Property;
import com.geointelli.ai.property.service.repository.PropertyRepository;
import com.geointelli.ai.property.service.service.PropertyService;

import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
@Data
public class PropertyServiceImpl implements PropertyService {
    private final PropertyRepository propertyRepository;

    @Transactional
    @Override
    public Property saveProperty(Property property) {
        Property existing = propertyRepository.findByFolio(property.getFolio()).orElse(null);
        if (existing != null) {
            property.setId(existing.getId());
        }
        return propertyRepository.save(property);
    }

    @Override
    public Property getByFolio(String folio) {
        return propertyRepository.findByFolio(folio).orElse(null);
    }
    
}
