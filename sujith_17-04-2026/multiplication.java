public class multiplication {
    public static void main(String[] args) {
        multiplication mul= new multiplication();
        mul.multiplications(7);
    }
    public static void  multiplications(int n){
        for (int i = 1; i <= 10; i++)
        {
            int mul =n*i ;
            System.out.println(mul);
        }
    }
}


