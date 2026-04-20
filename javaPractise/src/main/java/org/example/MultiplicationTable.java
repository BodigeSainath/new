package org.example;

public class MultiplicationTable {
    public static void main(String[] args){
tables(10);
    }

    public static void tables(int n){
        for(int i=1;i<=n; i++){
            for(int j=1; j<=10;j++){
                System.out.print(j*i+" ");
            }System.out.println();
        }
    }
}
