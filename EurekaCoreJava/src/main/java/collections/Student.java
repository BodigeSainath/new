package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Student {
    public  int id;
    public String name;
    public String email;
    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student s1=new Student(1,"abc","abc@gmail.com");
        Student s2=new Student(2,"xyz","xyz@gmail.com");
        Student s3=new Student(3,"acb","acb@gmail.com");
        list.add(s1);
        list.add(s2);
        list.add(s3);
//        for(Student s : list){
//            System.out.println("id "+s.id+" name "+s.name+" email "+s.email);
//        }
        List<Student> list2 = Arrays.asList(s1,s2);
        //list2.add(s3);
        List<String> location =new ArrayList<>(List.of("Hyd","Bang","Mumbai"));
        location.add("Pune");
        location.remove("Bang");
        for (String s : location){
            System.out.println(s);
        }

    }
}
