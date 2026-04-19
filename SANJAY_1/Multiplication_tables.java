public class Multiplication_tables {
    public static void table(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
        IO.println();
    }

    public static void main(String[] args) {
        table(10);
    }
}
