package collections;

import java.util.ArrayList;
import java.util.List;

public class StudentDB {
    public int id;
    public String name;
    public String classStudying;
    public StudentDB(int id, String name, String classStudying) {
        this.id = id;
        this.name = name;
        this.classStudying = classStudying;
    }
    public StudentDB(){

    }
    public List<StudentDB> getStudents(){
        ArrayList<StudentDB> students = new ArrayList<>();
        students.add(new StudentDB(1, "Sai", "10th"));
        students.add(new StudentDB(2, "John", "9th"));
        students.add(new StudentDB(3, "David", "8th"));
        students.add(new StudentDB(4, "Ravi", "7th"));
        students.add(new StudentDB(5, "Kiran", "10th"));
        students.add(new StudentDB(6, "Aman", "6th"));
        students.add(new StudentDB(7, "Priya", "9th"));
        students.add(new StudentDB(8, "Neha", "8th"));
        students.add(new StudentDB(9, "Rahul", "7th"));
        students.add(new StudentDB(10, "Anjali", "10th"));
        return students;
    }
}
