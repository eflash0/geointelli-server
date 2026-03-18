package com.geointelli.ai.property.service.dto;

import java.util.List;

import lombok.Data;

@Data
public class PropertyDTO {

    private String folio;

    private String propertyType;

    private String zoning;

    private Integer yearBuilt;

    private Double bedroomCount;

    private Double bathroomCount;

    private Integer halfBathroomCount;

    private Integer floorCount;

    private Integer unitCount;

    private Integer buildingActualArea;

    private Integer buildingHeatedArea;

    private Double lotSize;

    private Integer assessmentYear;

    private Long assessedValue;

    private AddressDTO address;

    private List<OwnerDTO> owners;

    private List<AssessmentDTO> assessments;

    private List<BuildingDTO> buildings;

    private List<LandDTO> lands;

    private List<SaleDTO> sales;

    private List<TaxDTO> taxes;

    private ParcelDTO parcel;
}
