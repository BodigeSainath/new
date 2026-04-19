package org.example;

public class CelsiusToFarenheit {
    public static void main(String[] args){
         double Farenheit =celsiusToFarenheit(45);
         System.out.print(Farenheit);
    }
    public static double celsiusToFarenheit(int c){

         int f =( c* 9/5) + 32;
         return f;
    }
}
