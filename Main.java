package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Pawan", 25, 3.9);
        Student s2 = new Student("John",  22, 1.8);
        Student s3 = new Student("Sara",  23, 3.5);

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

        System.out.println(s1.name + " passing: " + s1.isPassing()); // true
        System.out.println(s2.name + " passing: " + s2.isPassing()); // false
    }
}

