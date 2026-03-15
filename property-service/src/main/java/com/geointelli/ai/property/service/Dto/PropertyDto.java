package com.geointelli.ai.property.service.DTO;

import java.util.List;

import lombok.Data;

@Data
public class PropertyDTO {

    private String folio;

    private Double bedroomCount;

    private Double bathroomCount;

    private Integer yearBuilt;

    private Double lotSize;

    private AddressDTO address;

    private List<OwnerDTO> owners;

    private List<AssessmentDTO> assessments;

    private List<BuildingDTO> buildings;

    private List<LandDTO> lands;

    private List<SaleDTO> sales;

    private List<TaxDTO> taxes;

    private ParcelDTO parcel;
}
