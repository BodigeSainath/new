package org.example;

public class Reverse {
    public static void main(String[] args){
         reverse("hello");
    }
    public static void reverse(String s1){
       String[] arr = s1.split("");
       String  result ="";
        for(int i = arr.length-1; i>=0; i--){
            result += arr[i];
        }System.out.print(result);
    }
}
