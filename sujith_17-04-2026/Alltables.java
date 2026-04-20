public class Alltables {
    public static void main(String[] args) {
        Alltables mul = new Alltables();
        mul.multiplications(10);
    }

        public static void multiplications ( int n){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= 10; j++) {
                    int mul = i*j;
                    System.out.println(mul);
                }
            }
        }
    }
