package ua.lyashko.lesson17;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    public int compare ( Product a , Product b ) {
        return b.getPrice ( ).compareTo ( a.getPrice ( ) );
    }
}
