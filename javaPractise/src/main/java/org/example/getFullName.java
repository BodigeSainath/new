package org.example;

public class getFullName {
    public static void main(String[] args){
       String fullName= getFullName("Priya", "Sira");
       System.out.print(fullName);
    }

    public static String getFullName(String f1, String f2){
        return f1+ " "+f2;
    }
}
