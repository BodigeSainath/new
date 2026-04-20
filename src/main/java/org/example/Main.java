package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        stock s1 = new stock("AAPL", "Apple", 3000000.99, 1.5);

        System.out.println(s1.getTickerSymbol());
        System.out.println(s1.getTickerName());
        System.out.println(s1.getMarketCap());
        System.out.println(s1.getCurrentRatio());

        s1.setMarketCap(4000000.99);
        s1.setCurrentRatio(2.0);
        System.out.println(s1.getMarketCap());
        System.out.println(s1.getCurrentRatio());

    }
}
