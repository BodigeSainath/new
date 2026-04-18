package org.example;

public class NumberReversePyramidWithSpaces {
    public static void main(String[] args){
        int n= 4;
        for(int i =0; i<=n; i++){
            for(int k=1; k<i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=(n-i); j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
