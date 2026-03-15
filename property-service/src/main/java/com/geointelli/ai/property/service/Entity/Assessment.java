package com.geointelli.ai.property.service.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "assessments")
@Data
public class Assessment {

    @Id
    @GeneratedValue
    private Long id;

    private Integer year;

    private Long landValue;

    private Long buildingValue;

    private Long extraFeatureValue;

    private Long totalValue;

    @ManyToOne
    private Property property;
}
