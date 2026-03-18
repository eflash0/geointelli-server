package com.geointelli.ai.property.service.entity;

import java.util.List;
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

    @ManyToMany
    @JoinTable(
        name = "property_owner",
        joinColumns = @JoinColumn(name = "property_id"),
        inverseJoinColumns = @JoinColumn(name = "owner_id")
    )
    private List<Owner> owners;

    @OneToMany(mappedBy = "property")
    private List<Assessment> assessments;

    @OneToMany(mappedBy = "property")
    private List<Building> buildings;

    @OneToMany(mappedBy = "property")
    private List<Land> lands;

    @OneToMany(mappedBy = "property")
    private List<Sale> sales;

    @OneToMany(mappedBy = "property")
    private List<TaxRecord> taxes;

    @OneToOne(mappedBy = "property")
    private Parcel parcel;

    @OneToOne(mappedBy = "property")
    private Address address;
}