public class Main {
        public static void main(String[] args){
            int i= 0;
            for(i=0; i<5;i++){
                System.out.println("Wassup");
            }
        int n = 10;
            int firstNumber =0;
            int secondNumber=1;
            int nextNumber;
            for(i=1;i<n;i++){
                System.out.println(firstNumber);
                nextNumber = firstNumber +secondNumber;
                firstNumber= secondNumber;
                secondNumber= nextNumber;

            }

            int k=0;
            int l=1;
            int m;
            while(k<10){
                System.out.println(k);
                m=k+l;
                k= l;
                l= m;
            }

        }
    }


