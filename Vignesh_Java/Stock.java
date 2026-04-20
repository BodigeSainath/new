public class Stock {
    private String tickerSymbol;
    private String tickerName;
    double marketCap;
    double currentRatio;
    public void settickerSymbol(String tickerSymbol){
        this.tickerSymbol=tickerSymbol;
    }
    public void settickerName(String tickerName){
        this.tickerName=tickerName;
    }
    public void setDetails(double marketCap,double currentRatio){
        this.currentRatio=currentRatio;
        this.marketCap=marketCap;
    }
    public  void getDetails(){
        System.out.println("\nTicker name : "+this.tickerName +"\nTicker Symbol : "+this.tickerSymbol+"\nMarketCap : "+marketCap+"\nCurrentRatio : "+currentRatio);
    }
}
