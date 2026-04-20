package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // default constructor
        car c1 = new car();
        c1.display();

        // parameterized constructor
        car c2 = new car("Toyota", 2022, 25000.99);
        c2.display();

        car c3 = new car("Tesla", 2023, 55000.99);
        c3.display();
    }
}
