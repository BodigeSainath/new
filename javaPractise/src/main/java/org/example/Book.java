package org.example;

public class Book {
    String title;
    int price;
    //int finalPrice;
public static void main(String[] args){
    Book b1= new Book();
    b1.title= "Java";
    b1.price = 500;
    b1.display();
    b1.discount(100);
    b1.increasePrice(200);

}

public void display(){
    System.out.println(title +"actual price is  "+ price);
}
public void discount(int i){
    int finalPrice  = price - i;
    System.out.println(title + "discount price is  "+ finalPrice);
}
public void increasePrice(int i){
    int amountWithTaxes = price +i;
    System.out.println(title + "price after taxes or increased price is "+ amountWithTaxes);
}
}
