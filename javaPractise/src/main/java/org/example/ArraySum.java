package org.example;

public class ArraySum {
    public static void main(String[] args){
        arrayNames();
    }
    public static void arrayNames(){
        String[] arr = new String[5];
        arr[0]="priya";
        arr[1]= "aap";
        for(int i =0; i<=arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
