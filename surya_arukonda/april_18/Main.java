package org.example;

import org.example.utils.Student;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student obj = new Student();
        obj.studentName = "Surya";
        obj.age = 28;
        obj.dob = new Date(97, 4, 22);
        obj.Run();
        obj.Drink();

        System.out.println("Student name: " + obj.studentName);
        System.out.println("Student age: " + obj.age);
        System.out.println("Student date of birth: " + obj.dob);
        System.out.println("Student year of birth: " + obj.dob.getYear());
    }
}