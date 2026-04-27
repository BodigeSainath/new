package com.Eurekha.Core.Sainath.Solid;

public class Creditcard implements Bankcard {

    @Override
    public void DoTransaction(int amount) {
        System.out.println("Payment done from credit card successfully");
    }
}
