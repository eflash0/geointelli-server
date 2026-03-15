package com.geointelli.ai.property.service.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "lands")
@Data
public class Land {

    @Id
    @GeneratedValue
    private Long id;

    private Double units;

    private Double unitPrice;

    private String zoning;

    private Double frontage;

    private Double depth;

    private Double area;

    private String landUse;

    @ManyToOne
    private Property property;
}
