package org.example;

public class StudentClass {
String fullName;
Integer Age;
    public static void main(String[] args) {
        StudentClass x = new StudentClass();
        x.fullName = "priya";
        x.Age = 25;
    }

    public  void display() {
        System.out.print(fullName + Age);

    }
}