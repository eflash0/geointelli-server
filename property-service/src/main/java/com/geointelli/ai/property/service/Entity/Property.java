package com.geointelli.ai.property.service.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "properties")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String folio;

    private String parentFolio;

    private Integer bathroomCount;

    private Integer bedroomCount;

    private Double halfBathroomCount;

    private Integer buildingActualArea;

    private Integer buildingBaseArea;

    private Integer buildingEffectiveArea;

    private Integer buildingGrossArea;

    private Integer buildingHeatedArea;

    private String dorCode;

    private String dorDescription;

    private Integer neighborhood;

    private String neighborhoodDescription;

    private Double lotSize;

    private Integer floorCount;

    private Integer unitCount;

    private String yearBuilt;

    private String municipality;

    private String subdivision;

    private String primaryZone;

    private String primaryZoneDescription;

    private String status;

    private String showCurrentValuesFlag;

    private String message;

    @ManyToMany
    @JoinTable(
        name = "property_owner",
        joinColumns = @JoinColumn(name = "property_id"),
        inverseJoinColumns = @JoinColumn(name = "owner_id")
    )
    private List<Owner> owners;

    @OneToMany(mappedBy = "property", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Assessment> assessments;

    @OneToMany(mappedBy = "property", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Building> buildings;

    @OneToMany(mappedBy = "property", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Land> lands;

    @OneToMany(mappedBy = "property", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Sale> sales;

    @OneToMany(mappedBy = "property", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tax> taxes;

    @OneToOne(mappedBy = "property", cascade = CascadeType.ALL, orphanRemoval = true)
    private Parcel parcel;

    @OneToMany(mappedBy = "property", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Address> addresses;
}