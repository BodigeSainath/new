package collections;

public interface IA {
   default public void log(){
       System.out.println("Method from A");
   }
}
