public class Brahmaiahobj {

    public static void main(String [] args){

        employeeBrahmi b = new employeeBrahmi();
        b.firstName = "ravi";
        b.lastName = "kumar";
        b.age = 25;
        b.email = "employeeravi@gmail.com";

        b.eat();
        b.sleep();

        System.out.println();
        Players p = new Players();
        p.name = "Puli";
        p.runs= 59;

        p.runs();

        p.name();


    }
}
