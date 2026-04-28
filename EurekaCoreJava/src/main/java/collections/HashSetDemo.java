package collections;

import java.util.HashSet;
import java.util.Set;
public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> names= new HashSet<>();
        names.add("James");
        names.add("John");
        names.add("john");
        names.add("jack");
       // names.removeAll();
        for(String n : names){
            System.out.println(n);
        }
    }
}
