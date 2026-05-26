package com.eureka.stockDemo.dto;
import java.util.List;

public class StockFundamentalResponseDto {
    private Long marketCap;

    private Double currentRatio;

    private List<TradingHistoryDto> tradingHistory;

    public Long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(Long marketCap) {
        this.marketCap = marketCap;
    }

    public Double getCurrentRatio() {
        return currentRatio;
    }

    public void setCurrentRatio(Double currentRatio) {
        this.currentRatio = currentRatio;
    }

    public List<TradingHistoryDto> getTradingHistory() {
        return tradingHistory;
    }

    public void setTradingHistory(List<TradingHistoryDto> tradingHistory) {
        this.tradingHistory = tradingHistory;
    }
}
