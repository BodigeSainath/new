package collections;

import java.util.ArrayList;

public class ToDoList {
    ArrayList<String> list =new ArrayList<>();
    public void addToDo(String str){
        list.add(str);
    }
    public void removeToDo(int index){
        list.remove(index);
    }
    public void getAllToDo(){
        for (String n:list){
            System.out.println(n);
        }
    }
}
