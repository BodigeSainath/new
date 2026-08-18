package collections;

import java.util.ArrayList;

public class StockFundamentals {
    String tickerSymbol;
    double MarketCap;
    double CurrentRatio;
    SubSectorLookUp Sub;
    ArrayList<CompanyLocations> Loc;
    StockFundamentals(){
        Loc=new ArrayList<>();
        Sub=new SubSectorLookUp();
    }
}
