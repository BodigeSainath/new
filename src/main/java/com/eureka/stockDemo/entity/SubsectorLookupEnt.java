package com.eureka.stockDemo.entity;
import jakarta.persistence.*;


@Entity
@Table(name = "subsector_lookup", schema = "endeavour")
public class SubsectorLookupEnt {
    public SubsectorLookupEnt(){

    }
    @Id
    @Column(name = "subsector_id")
    private Integer subsectorId;

    @Column(name = "subsector_name")
    private String subsectorName;

    @ManyToOne
    @JoinColumn(name = "sector_id")
    private SectorLookUpE sector;

    public Integer getSubsectorId() {
        return subsectorId;
    }

    public void setSubsectorId(Integer subsectorId) {
        this.subsectorId = subsectorId;
    }

    public String getSubsectorName() {
        return subsectorName;
    }

    public void setSubsectorName(String subsectorName) {
        this.subsectorName = subsectorName;
    }

    public SectorLookUpE getSector() {
        return sector;
    }

    public void setSector(SectorLookUpE sector) {
        this.sector = sector;
    }
}
