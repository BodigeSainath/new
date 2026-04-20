package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

<<<<<<< src/main/java/org/example/Main.java
        // default constructor
        car c1 = new car();
        c1.display();

        // parameterized constructor
        car c2 = new car("Toyota", 2022, 25000.99);
        c2.display();

        car c3 = new car("Tesla", 2023, 55000.99);
        c3.display();
=======pawan
        stock s1 = new stock("AAPL", "Apple", 3000000.99, 1.5);

        System.out.println(s1.getTickerSymbol());
        System.out.println(s1.getTickerName());
        System.out.println(s1.getMarketCap());
        System.out.println(s1.getCurrentRatio());

        s1.setMarketCap(4000000.99);
        s1.setCurrentRatio(2.0);
        System.out.println(s1.getMarketCap());
        System.out.println(s1.getCurrentRatio());

>>>>>>> src/main/java/org/example/Main.java
    }
}
