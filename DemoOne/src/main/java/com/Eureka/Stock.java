package com.Eureka;

public class Stock {

    private String tickerSymbol;
    private String tickerName;

    private int MarketCap;
    private  int CurrentRatio;

    public String getTickerSymbol(){
            return  tickerSymbol;
    }

    public String getTickerName(){
        return  tickerName;
    }

    public void setMarketCap(int MarketCap){
        this.MarketCap=MarketCap;
    }
    public void setCurrentRatio(int CurrentRatio){
        this.CurrentRatio=CurrentRatio;
    }

    public int getMarketCap(){
       return MarketCap;
    }

    public int getCurrentRatio(){
        return CurrentRatio;
    }
}
