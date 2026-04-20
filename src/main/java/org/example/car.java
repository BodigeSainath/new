package org.example;

public class car {
    public String brand;
    public int year;
    public double price;

    // default constructor
    car() {
        brand = "Unknown";
        year  = 0;
        price = 0.0;
    }

    // parameterized constructor
    car(String brand, int year, double price) {
        this.brand = brand;
        this.year  = year;
        this.price = price;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Year:  " + year);
        System.out.println("Price: " + price);
        System.out.println("---");
    }
}