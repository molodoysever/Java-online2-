package ua.lyashko.lesson17;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main ( String[] args ) {
        ArrayList<Product> products = new ArrayList<> ( );

        Category phones = new Category ( "phones" , 1L );
        Category tablets = new Category ( "tablets" , 2L );
        Category tv = new Category ( "tv" , 3L );
        Category laptop = new Category ( "laptop" , 4L );

        products.add ( new Product ( "Xiaomi" , new BigDecimal ( 10_000 ) , phones ) );
        products.add ( new Product ( "Dell" , new BigDecimal ( 10_500 ) , tablets ) );
        products.add ( new Product ( "LG" , new BigDecimal ( 17_200 ) , tv ) );
        products.add ( new Product ( "Macbook" , new BigDecimal ( 99_998 ) , laptop ) );
        products.add ( new Product ( "iPhone" , new BigDecimal ( 50_000 ) , phones ) );
        products.add ( new Product ( "iPad" , new BigDecimal ( 27_600 ) , tablets ) );
        products.add ( new Product ( "Kiwi" , new BigDecimal ( 7_800 ) , tv ) );
        products.add ( new Product ( "Asus" , new BigDecimal ( 38_999 ) , laptop ) );
        products.add ( new Product ( "Acer" , new BigDecimal ( 46_350 ) , laptop ) );
        products.add ( new Product ( "Samsung" , new BigDecimal ( 44_444 ) , phones ) );


        System.out.println (products );
        System.out.println (BubbleSort.bubbleSort ( products ) );
    }
}
