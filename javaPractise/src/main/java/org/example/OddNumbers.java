package org.example;

public class OddNumbers {
    public static void main(String[] args){
       oddNumbers(10);
    }
    public static int oddNumbers(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i);
            }
        }
        return n;
    }
}
