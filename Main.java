public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.FullName = "Sanjay Kumar";
        s1.Age = 25;
        s1.DateOfBirth = "01-01-2000";

        s1.Run();
        s1.Drink();

        Student s2 = new Student();
        s2.FullName = "Ravi Teja";
        s2.Age = 22;
        s2.DateOfBirth = "05-05-2002";

        s2.Run();
        s2.Drink();
    }
}