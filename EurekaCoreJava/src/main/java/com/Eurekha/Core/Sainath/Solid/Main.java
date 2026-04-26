package com.Eurekha.Core.Sainath.Solid;

public class Main {
    public static void main(String[] args) {
        Creditcard creditcard = new Creditcard();
        ShoppingMall shoppingMall = new ShoppingMall(creditcard);
        shoppingMall.buyItem();
    }
}
