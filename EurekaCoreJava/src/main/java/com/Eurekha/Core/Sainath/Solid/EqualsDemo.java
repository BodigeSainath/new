package com.Eurekha.Core.Sainath.Solid;

import collections.Student;

public class EqualsDemo {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        Student student1=new Student(1,"stud1","stud1@gmail");
        Student student2=new Student(1,"stud1","stud1@gmail");
        if(student1==student2){
            System.out.println("== equal");
        }else{
            System.out.println("!=");
        }
        System.out.println(student1);
//        if(student1.equals(student2)){
//            System.out.println("Same student");
//        }
//        else {
//            System.out.println("Different Student");
//        }
    }
}
