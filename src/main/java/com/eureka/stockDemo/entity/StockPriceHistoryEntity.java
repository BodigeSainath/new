package com.eureka.stockDemo.entity;
import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(
        name = "stocks_price_history",
        schema = "endeavour")
public class StockPriceHistoryEntity {
    public StockPriceHistoryEntity() {
    }

    @Id
    @Column(name = "trading_date")
    private LocalDate tradingDate;

    @Column(name = "ticker_symbol")
    private String tickerSymbol;


    @Column(name = "close_price")
    private Double closePrice;

    @Column(name = "volume")
    private Long volume;



    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public LocalDate getTradingDate() {
        return tradingDate;
    }

    public void setTradingDate(LocalDate tradingDate) {
        this.tradingDate = tradingDate;
    }

    public Double getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(Double closePrice) {
        this.closePrice = closePrice;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }
}
