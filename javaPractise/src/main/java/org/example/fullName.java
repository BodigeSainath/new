//package org.example;
//
//public class fullName {
//
////    public static String getFullName(String f1, String f2){
////        return f1 + " " +f2;
////    }
////    public static void main(String[] args) {
////
////        String fullName = getFullName("priya", "Sira" );
////            System.out.print(fullName);
////
////
////    }
//
//    public static int multiplication(int i, int j){
//        int n = i*j;
//        return n;
//    }
//
//    public static int division(int i, int j){
//        int n = i/j;
//        return n;
//
//    }
//    public static int SumOfIntegers(int i, int j , int k){
//        int n= i+j+k;
//        return n;
//    }
//
//
//    public static void main(String[] args){
//        int product = multiplication(2,3);
//            System.out.print( "product is " + product );
//            System.out.println();
//
//        int quotient= division(6,3);
//            System.out.print("quotient is " + quotient);
//
//
//
//        }
//    }
//
//public static String toUpperCase(String str) {
//    String[] words = str.split(" ");
//    String result = "";
//
//
//
//    for (String word : words) {
//        if (word.length() > 0) {
//            String first = word.substring(0,1).toUpperCase();
//            String rest = word.substring(1).toLowerCase();
//            result += first + rest + " ";
//        }
//    }
//
//    return result.trim();
//}
//
//public static void main(String[] args) {
//    String input = "priya sira";
//    String output = toUpperCase(input);
//    System.out.println(output);
//}
//}