package org.example;

public class MultiplyThreeNumbers {
    public static void main(String[] args) {
        int product = multiplyThreeNumbers(2, 3, 4);
        System.out.print(product);
    }

    public static int multiplyThreeNumbers(int i, int j, int k) {
        return i * j * k;
    }
}
