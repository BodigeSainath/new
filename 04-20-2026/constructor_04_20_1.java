public class constructor_04_20_1 {
    String name;
    int age;
    double gpa;
    //default
    constructor_04_20_1(){

    }
    //constructors paramatized
    constructor_04_20_1(String name, int age,double gpa){
        this.name= name;
        this.age=age;
        this.gpa=gpa;
    }
    //method
    void study(){
        IO.println(this.name+ "is studying");
    }
}
