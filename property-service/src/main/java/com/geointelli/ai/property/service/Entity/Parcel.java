package com.geointelli.ai.property.service.Entity;

import org.locationtech.jts.geom.MultiPolygon;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "parcels_new")
@Getter
@Setter
public class Parcel {

    @Id
    @Column(name = "fid")
    private Long id;

    @Column(name = "folio")
    private String folio;

    @Column(name = "geom", columnDefinition = "geometry(MultiPolygon,4326)")
    private MultiPolygon geom;

    @Column(name = "lot_size")
    private Double lotSize;

    @OneToOne(mappedBy = "parcel")
    private Property property;
}
