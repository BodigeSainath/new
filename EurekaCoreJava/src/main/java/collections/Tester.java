package collections;

import Interface.Employees;

public class Tester extends Employees {


    public double calculateBonus() {
        double bonus=salary+(salary * 0.5);
        return bonus;
    }
}
