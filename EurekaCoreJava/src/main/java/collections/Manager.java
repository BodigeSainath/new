package collections;

import Interface.Employees;

public class Manager extends Employees {

    public Manager(){
        super();
    }

    public double calculateBonus() {
        double bonus=salary+(salary * 1.2);
        return bonus;
    }
}
