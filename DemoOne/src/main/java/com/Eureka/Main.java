package com.Eureka;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FixedDepositAmount obj1=new FixedDepositAmount();
        obj1.GetSurrenderInterest();

        CurrentAccount obj2=new CurrentAccount();
        obj2.Deposit();
        obj2.GetOverDraft();
        obj2.Withdrawal();

    }



}

