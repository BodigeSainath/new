public class Avg
    {
        public static void main(String[] args) {
        int[] arry = {1,2,3,4,5,6,7,8,9};
        int sum=0;
        int avg=0;
        for(int i=0;i<arry.length;i++){
            sum= (sum+ arry[i]);
        }
         avg =sum/arry.length;
        System.out.println("avg of "+ avg);

    }

    }

