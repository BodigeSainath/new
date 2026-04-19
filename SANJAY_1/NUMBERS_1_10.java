public class NUMBERS_1_10 {
    public static void main(String[] args) {
        System.out.println(printNumbers());
    }
    public static String printNumbers() {
        String output = "";
        for(int i = 1; i <= 10; i++){
            output += i + " ";
        }
        return output;
    }
}