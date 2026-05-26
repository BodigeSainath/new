package com.eureka.stockDemo.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "sector_lookup", schema = "endeavour")
public class SectorLookUpE {
    @Id
    @Column(name = "sector_id")
    private Integer sectorId;

    @Column(name = "sector_name")
    private String sectorName;

    public Integer getSectorId() {
        return sectorId;
    }

    public void setSectorId(Integer sectorId) {
        this.sectorId = sectorId;
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }
}
