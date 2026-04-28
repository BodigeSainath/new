package collections;

public class ToDoMain {
    public static void main(String[] args) {
        ToDoList toDoList=new ToDoList();
        for (int i = 1; i <=10 ; i++) {
            toDoList.addToDo("Task number "+i);
        }
        toDoList.removeToDo(4);
        toDoList.removeToDo(7);
        toDoList.getAllToDo();
    }
}
