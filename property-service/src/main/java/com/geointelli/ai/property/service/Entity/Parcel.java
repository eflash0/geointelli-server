package com.geointelli.ai.property.service.Entity;

import org.locationtech.jts.geom.MultiPolygon;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "parcels_new")
@Data
@NoArgsConstructor
@AllArgsConstructor
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

    @OneToOne
    @JoinColumn(name = "property_id")
    private Property property;
}
