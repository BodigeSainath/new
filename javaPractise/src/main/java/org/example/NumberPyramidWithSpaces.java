package org.example;

public class NumberPyramidWithSpaces {
    public static void main(String[] args){
        int n= 3;
        for(int i=1;i<=n; i++){
            for(int k=n; k>i; k--){
                System.out.print(" ");

            }for(int j=1;j<=i; j++){
                System.out.print(j+ " ");
            }System.out.println();
        }
    }
}
