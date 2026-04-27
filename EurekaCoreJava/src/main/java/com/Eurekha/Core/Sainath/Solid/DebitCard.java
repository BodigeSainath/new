package com.Eurekha.Core.Sainath.Solid;

public class DebitCard implements Bankcard {
    @Override
    public void DoTransaction(int amount) {
        System.out.println("Payment done from Debit card successfully");
    }
}
