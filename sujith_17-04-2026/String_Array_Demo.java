public class String_Array_Demo {
    public static void main(String[] args) {
        String[] n = stname();

        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }

    public static String[] stname() {
        String[] name = {"suji", "john", "khan"};
        return name;
    }


}