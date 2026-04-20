package org.example;

public class Employee {
    String name;// we define the class i.e., Employee should be like this
    int salary;

    public static void main(String[] args){
        //object creation, calling the method  and passing parameters
        Employee e1= new Employee(); //created object of type Employee
        e1.name ="Priya";// passed parameters
        e1.salary = 100000;// passed parameters
        e1.display(); // calling the method display

        Employee e2= new Employee(); // created object of type Employee
        e2.name= "Sira"; // passed parameters
        e2.salary= 700000;// passed parameters
        e2.display();// calling the method
    }
// creating a method
    public  void display(){
        System.out.print(name +" "+ salary);
    }
}
