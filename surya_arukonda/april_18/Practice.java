package org.example.utils;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;


public class Practice {

    public static void main(String[] args) {


        String[] new_array_str = getStudentsList();
        for (String s : new_array_str) {
            System.out.println(s);
        }

        String str = "james bond";

        int a = str.indexOf(2);
        String data = makeFirstLetterUpperCaseInSentence(str);
        System.out.println(data);
        System.out.println();


        String subString = makeFirstLetterUpperCase("hello");
        System.out.println(subString);


        int value = new Practice().factorial(5);
        System.out.println(value);
        int sum = addFourIntegers(1, 2, 3, 4);
        System.out.println("Sum is: " + sum);
    }

    public static String[] getStudentsList(){
        return new String[]{"surya", "vasisth", "priya", "manisha"};
    }

    public static String makeFirstLetterUpperCase(String str){
        if (str == null || str.isEmpty()){
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static String makeFirstLetterUpperCaseInSentence(String str){
        if (str == null || str.isEmpty()){
            return str;
        }
        String[] words =  str.split(" ");
        String finalString = "";
        for (String word: words) {
            finalString += word.substring(0,1).toUpperCase()+ word.substring(1)+ " ";
        }
        return finalString.trim();
    }

    static int addFourIntegers(int a, int b, int c, int d){
        return a + b + c + d;
    }

    void forLoopPrint(){
        for (int i =1; i <4; i++){
            for (int j=1; j<i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    int whileLoopPrint(){
        // using while loop
        int a = 1;
        while (a < 4) {
            int b = 1;
            while (b < a+1) {
                System.out.print(b);
                b++;
            }
            System.out.println();
            a++;
        }
        return 0;
    }

    void pyramid(){
        // pyramid pattern using for loop
        //             1
        //            1 2
        //           1 2 3
        //          1 2 3 4
        int n = 10;
        for (int i =1; i <n; i++){
            for (int j=1; j<n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i =1; i <n; i++){
            for (int j=1; j<i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=n-i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        else return factorial(n-1) * n;
    }
}


class Main1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];

            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        // for twoSum method
        int[] nums = {2, 7, 11, 15};
        int[] data = twoSum(nums, 9);
        System.out.println(Arrays.toString(data)); // [0, 1]
    }
}