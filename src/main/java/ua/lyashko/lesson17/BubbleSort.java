package ua.lyashko.lesson17;

import java.util.ArrayList;
import java.util.Comparator;

public class BubbleSort {
    public static ArrayList<Product> bubbleSort ( ArrayList<Product> products ) {
        Comparator<Product> productComparator =
                new CategoryComparator ( ).thenComparing ( new ProductComparator ( ) );

        boolean unsorted = true;
        while ( unsorted ) {
            unsorted = false;
            for (int i = 0; i < products.size ( ) - 1; i++) {
                if (productComparator.compare ( products.get ( i ) , products.get ( i + 1 ) ) >= 0) {
                    Product temp = products.get ( i );
                    products.set ( i , products.get ( i + 1 ) );
                    products.set ( i + 1 , temp );
                    unsorted = true;
                }
            }
        }
        return products;
    }
}
