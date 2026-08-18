package collections;

public class MyClass implements IA, B {

    @Override
    public void log() {
        IA.super.log();
    }
}