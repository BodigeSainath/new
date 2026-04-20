package org.example;

public class countVowels {
    public static void main(String[] args) {
     vowels("priya");
    }

    public static void vowels(String s1) {
        //String[] arr1 ={"a", "e", "i", "o","u"};
        String[] arr = s1.split("");
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals("a") || arr[i].equals("e") || arr[i].equals("i") || arr[i].equals("o") || arr[i].equals("u")) {

                count++;
            }
        }System.out.print(count);

    }
}
