package ua.lyashko.lesson17;

import java.util.ArrayList;
import java.util.Comparator;

public class BubbleSort {
    public static ArrayList<Product> bubbleSort ( ArrayList<Product> products ) {
        Comparator<Product> productComparator =
                new CategoryComparator ( ).thenComparing ( new ProductComparator ( ) );

        for (int i = 0; i < products.size ( ) - 1; i++) {
            for (int j = 0; j < products.size ( ) - i - 1; j++) {
                if (productComparator.compare ( products.get ( i ) , products.get ( i + 1 ) ) >= 0) {
                    Product temp = products.get ( i );
                    products.set ( i , products.get ( i + 1 ) );
                    products.set ( i + 1 , temp );
                    bubbleSort ( products );
                }
            }
        }
        return products;
    }
}
