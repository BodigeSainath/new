package com.eureka.stockDemo.dto;

import java.util.List;

public class SubsectorResponseDto {
    private String sectorName;

    private String subsectorName;

    private List<StockDto> topStocks;

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    public String getSubsectorName() {
        return subsectorName;
    }

    public void setSubsectorName(String subsectorName) {
        this.subsectorName = subsectorName;
    }

    public List<StockDto> getTopStocks() {
        return topStocks;
    }

    public void setTopStocks(List<StockDto> topStocks) {
        this.topStocks = topStocks;
    }
}
