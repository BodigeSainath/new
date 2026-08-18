package collections;

import java.util.Comparator;
import java.util.HashMap;

public class Product implements Comparable<Product> {

    public int Id;
    public String ProductName;
    public double Price;
    public int Quantity;
    public String Category;
    public String BrandName;
    public Product() {
    }

    @Override
    public int compareTo(Product o) {
        return this.Id-o.Id;
    }
}