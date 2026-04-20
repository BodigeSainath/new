package org.example;

public class stock {

    private String tickerSymbol;
    private String tickerName;

    private double marketCap;
    private double currentRatio;

    stock(String tickerSymbol, String tickerName, double marketCap, double currentRatio) {
        this.tickerSymbol  = tickerSymbol;
        this.tickerName    = tickerName;
        this.marketCap     = marketCap;
        this.currentRatio  = currentRatio;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public String getTickerName() {
        return tickerName;
    }

    public double getMarketCap() {
        return marketCap;
    }
    public void setMarketCap(double marketCap) {
        this.marketCap = marketCap;
    }

    public double getCurrentRatio() {
        return currentRatio;
    }
    public void setCurrentRatio(double currentRatio) {
        this.currentRatio = currentRatio;
    }
}
