public class oddnumbers {

    public static void main(String[] args) {
        int result = oddNumber();
    }
    public static int oddNumber(){
        for(int i=1; i<=100;i++) {
            if (i % 2 != 0) {
                System.out.println(i);

            }

        }
        return -1;
    }
}

