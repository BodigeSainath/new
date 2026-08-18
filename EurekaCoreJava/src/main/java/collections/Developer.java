package collections;

import Interface.Employees;

public class Developer extends Employees  {


    public double calculateBonus() {
        double bonus=salary+(salary * 1.10);
        return bonus;
    }
}
