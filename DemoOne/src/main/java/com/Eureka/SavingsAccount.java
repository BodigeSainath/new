package com.Eureka;

public class SavingsAccount extends BankAccount {

    public void GetInterest(){
        System.out.println("GetInterest from BankAccount");
    }


    public void Deposit(){
        System.out.println("From SavingsAccount");
    }
}
