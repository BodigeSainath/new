package collections;

import java.util.ArrayList;
import java.util.List;

public class Departments {
    public int id;
    public String name;
    public String location;
    public Departments(int id,String name,String location){
        this.id=id;
        this.name=name;
        this.location=location;
    }

    public static void main(String[] args) {
         Departments d1 =new Departments(01,"CSE","Kansas");
         Departments d2=new Departments(02,"IT","Boston");
        List<Departments> list =new ArrayList<>();
        list.add(d1);
        list.add(d2);
        for(Departments d : list){
            System.out.println("Id "+d.id+" name "+d.name);
        }
    }
}
