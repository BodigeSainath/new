package com.eureka.stockDemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


    @Entity
    @Table(name = "stocks_lookup", schema = "endeavour")
    public class StocksLookupEnt {

        @Id
        @Column(name = "ticker_symbol")
        private String tickerSymbol;

        @Column(name = "ticker_name")
        private String tickerName;

        public String getTickerSymbol() {
            return tickerSymbol;
        }

        public void setTickerSymbol(String tickerSymbol) {
            this.tickerSymbol = tickerSymbol;
        }

        public String getTickerName() {
            return tickerName;
        }

        public void setTickerName(String tickerName) {
            this.tickerName = tickerName;
        }
    }
