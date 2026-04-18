package org.example;

public class Student {

    // variables
    String name;
    int age;
    double gpa;

    // constructor
    Student(String name, int age, double gpa) {
        this.name = name;
        this.age  = age;
        this.gpa  = gpa;
    }

    // methods
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age:  " + age);
        System.out.println("GPA:  " + gpa);
        System.out.println("---");
    }

    boolean isPassing() {
        return gpa >= 2.0;
    }
}