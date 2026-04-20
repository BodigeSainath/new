package org.example;

public class Product {
    public static void main(String[] args){
       int product =product(2,3);
        System.out.print(product);
       int product2 = multiplyThreeNumbers(5, 6,7);
       System.out.print(product2);
    }

    public static int product(int i, int j){
        int p =i*j;
        return p;
    }
    public static int multiplyThreeNumbers(int i, int j, int k){

        int result=product(i, j) * k;
        return result;
    }
}
