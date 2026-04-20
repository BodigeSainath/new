package org.example;
//Create class:
//
//BankAccount → name, balance
//
// Methods:
//
//deposit(amount)
//withdraw(amount)
//display()
public class BankAccount {
    String name;
    int balance;
    public static void main(String[] args){
        BankAccount a1= new BankAccount();
        a1.name="priya";
        a1.balance = 1000;
        a1.display();
        a1.withdraw(100);
        a1.deposit(200);
    }
    public void deposit(int i){
        balance = balance +i;
        System.out.println("balance after deposit is " + balance);
    }
    public void withdraw(int i){
        balance = balance -i;
        System.out.println("balance after withdraw is "+ balance);
    }

    public void display(){
        System.out.println("Balance before deposit or withdraw is "+ balance);
    }
}
