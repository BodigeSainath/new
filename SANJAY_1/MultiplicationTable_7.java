
    public class MultiplicationTable_7 {
        public static int multiply(int a, int b) {
            return a * b;
        }
        public static void main(String[] args) {
            int n = 1;
           for(int i=1;i<=10;i++)
           {
                System.out.println("7 x " + n + " = " + multiply(7, n));
                n = n + 1;
            }
        }
    }

