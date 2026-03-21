package com.geointelli.ai.property.service.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.geointelli.ai.property.service.client.MiameDadeApiClient;
import com.geointelli.ai.property.service.client.dto.PropertyApiResponse;
import com.geointelli.ai.property.service.entity.Address;
import com.geointelli.ai.property.service.entity.Assessment;
import com.geointelli.ai.property.service.entity.Building;
import com.geointelli.ai.property.service.entity.Land;
import com.geointelli.ai.property.service.entity.Owner;
import com.geointelli.ai.property.service.entity.Property;
import com.geointelli.ai.property.service.entity.Sale;
import com.geointelli.ai.property.service.entity.Tax;
import com.geointelli.ai.property.service.mapper.AddressMapper;
import com.geointelli.ai.property.service.mapper.AssessmentMapper;
import com.geointelli.ai.property.service.mapper.BuildingMapper;
import com.geointelli.ai.property.service.mapper.LandMapper;
import com.geointelli.ai.property.service.mapper.OwnerMapper;
import com.geointelli.ai.property.service.mapper.PropertyMapper;
import com.geointelli.ai.property.service.mapper.SaleMapper;
import com.geointelli.ai.property.service.mapper.TaxMapper;
import com.geointelli.ai.property.service.mapper.external.ExternalAddressMapper;
import com.geointelli.ai.property.service.mapper.external.ExternalAssessmentMapper;
import com.geointelli.ai.property.service.mapper.external.ExternalBuildingMapper;
import com.geointelli.ai.property.service.mapper.external.ExternalLandMapper;
import com.geointelli.ai.property.service.mapper.external.ExternalOwnerMapper;
import com.geointelli.ai.property.service.mapper.external.ExternalPropertyMapper;
import com.geointelli.ai.property.service.mapper.external.ExternalSaleMapper;
import com.geointelli.ai.property.service.mapper.external.ExternalTaxMapper;
import com.geointelli.ai.property.service.repository.OwnerRepository;
import com.geointelli.ai.property.service.repository.PropertyRepository;
import com.geointelli.ai.property.service.service.PropertyIngestionService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class PropertyIngestionServiceImpl implements PropertyIngestionService {
    private final MiameDadeApiClient miameDadaApiClient;
    private final PropertyRepository propertyRepository;
    private final OwnerRepository ownerRepository;
    private final PropertyMapper propertyMapper;
    private final ExternalPropertyMapper externalPropertyMapper;
    private final OwnerMapper ownerMapper;
    private final ExternalOwnerMapper externalOwnerMapper;
    private final AssessmentMapper assessmentMapper;
    private final ExternalAssessmentMapper externalAssessmentMapper;
    private final SaleMapper saleMapper;
    private final ExternalSaleMapper externalSaleMapper;
    private final LandMapper landMapper;
    private final ExternalLandMapper externalLandMapper;
    private final TaxMapper taxMapper;
    private final ExternalTaxMapper externalTaxMapper;
    private final BuildingMapper buildingMapper;
    private final ExternalBuildingMapper externalBuildingMapper;
    private final AddressMapper addressMapper;
    private final ExternalAddressMapper externalAddressMapper;

    @Override
    public void ingest(String folio) throws Exception {

        Mono<String> responseEmitter = miameDadaApiClient.importMiameDadePropertyDetails(folio);
        String responseString = responseEmitter.block();
        ObjectMapper mapper = new ObjectMapper();
        PropertyApiResponse propertyApiResponse = mapper.readValue(responseString, PropertyApiResponse.class);

        Property property = propertyMapper.toEntity(externalPropertyMapper.toDTO(propertyApiResponse.getPropertyInfo()));

        List<Owner> owners = propertyApiResponse.getOwnerInfos().stream()
                    .map(externalOwnerMapper::toDTO)
                    .map(ownerMapper::toEntity).toList();
        ownerRepository.saveAll(owners);                    

        List<Assessment> assessments = propertyApiResponse.getAssessment().getAssessmentInfos()
                    .stream().map(externalAssessmentMapper::toDTO)
                    .map(assessmentMapper::toEntity).toList();
        assessments.forEach(assessment -> assessment.setProperty(property));    

        List<Sale> sales = propertyApiResponse.getSalesInfos().stream()
                    .map(externalSaleMapper::toDTO)
                    .map(saleMapper::toEntity).toList();
        sales.forEach(sale -> sale.setProperty(property));

        List<Land> lands = propertyApiResponse.getLand().getLandlines().stream()
                    .map(externalLandMapper::toDTO)
                    .map(landMapper::toEntity).toList();
        lands.forEach(land -> land.setProperty(property));

        List<Tax> taxes = propertyApiResponse.getTaxable().getTaxableInfos().stream()
                    .map(externalTaxMapper::toDTO)
                    .map(taxMapper::toEntity).toList();
        taxes.forEach(tax -> tax.setProperty(property));            
                    
        List<Building> buildings = propertyApiResponse.getBuilding().getBuildingInfos().stream()
                    .map(externalBuildingMapper::toDTO)
                    .map(buildingMapper::toEntity).toList();
        buildings.forEach(building -> building.setProperty(property));                    

        List<Address> addresses = propertyApiResponse.getSiteAddress().stream()
                    .map(externalAddressMapper::toDTO)
                    .map(addressMapper::toEntity).toList();
        addresses.forEach(address -> address.setProperty(property));
        
        property.setOwners(owners);
        property.setAddresses(addresses);
        property.setAssessments(assessments);
        property.setBuildings(buildings);
        property.setLands(lands);
        property.setTaxes(taxes);
        property.setSales(sales);
        propertyRepository.save(property);
    }

}
