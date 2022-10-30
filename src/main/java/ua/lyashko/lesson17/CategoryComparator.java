package ua.lyashko.lesson17;

import java.util.Comparator;

public class CategoryComparator implements Comparator<Product> {
    public int compare(Product a, Product b) {
        return a.getCategory ().getCategoryId ().compareTo ( b.getCategory ( ).getCategoryId ( ) );
    }
}
