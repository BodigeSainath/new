package com.Eurekha.Core.Sainath.Solid;

public class ShoppingMall {
    Bankcard card;
    public  ShoppingMall(Bankcard card){
        this.card = card;
    }
    public  void buyItem(){
        this.card.DoTransaction(100);
    }
}
