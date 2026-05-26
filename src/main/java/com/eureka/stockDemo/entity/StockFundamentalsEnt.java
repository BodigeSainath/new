package com.eureka.stockDemo.entity;
import jakarta.persistence.*;

    @Entity
    @Table(name = "stock_fundamentals", schema = "endeavour")
    public class StockFundamentalsEnt {
        public StockFundamentalsEnt(){

        }
        @Id
        @Column(name = "ticker_symbol")
        private String tickerSymbol;

        @Column(name = "market_cap")
        private Long marketCap;

        public Double getCurrentRatio() {
            return currentRatio;
        }

        public void setCurrentRatio(Double currentRatio) {
            this.currentRatio = currentRatio;
        }

        @Column(name = "current_ratio")
        private Double currentRatio;

        @ManyToOne
        @JoinColumn(
                name = "ticker_symbol",
                referencedColumnName = "ticker_symbol",
                insertable = false,
                updatable = false
        )
        private StocksLookupEnt stock;

        public SubsectorLookupEnt getSubsector() {
            return subsector;
        }

        public void setSubsector(SubsectorLookupEnt subsector) {
            this.subsector = subsector;
        }

        @ManyToOne
        @JoinColumn(
                name = "subsector_id",
                referencedColumnName = "subsector_id"
        )
        private SubsectorLookupEnt subsector;

        public String getTickerSymbol() {
            return tickerSymbol;
        }

        public void setTickerSymbol(String tickerSymbol) {
            this.tickerSymbol = tickerSymbol;
        }

        public Long getMarketCap() {
            return marketCap;
        }

        public void setMarketCap(Long marketCap) {
            this.marketCap = marketCap;
        }

        public StocksLookupEnt getStock() {
            return stock;
        }

        public void setStock(StocksLookupEnt stock) {
            this.stock = stock;
        }
    }
