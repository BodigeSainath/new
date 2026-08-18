package collections;

public interface B {
    default void log(){
        System.out.println("method from B");
    }
}
