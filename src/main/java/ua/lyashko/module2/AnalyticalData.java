package ua.lyashko.module2;

import java.util.*;
import java.util.stream.Collectors;

public class AnalyticalData<T> {

    public static String soldByCategory ( List<Invoice> invoices ) {
        int televisions = (int) invoices.stream ( )
                .flatMap ( x -> ( x.goods.stream ( ) ) )
                .filter ( x -> x.toString ( ).contains ( "Television" ) )
                .count ( );

        int telephones = (int) invoices.stream ( )
                .flatMap ( x -> ( x.goods.stream ( ) ) )
                .filter ( x -> x.toString ( ).contains ( "Telephone" ) )
                .count ( );

        return "Televisions: " + televisions + " Telephones: " + telephones;
    }

    public static String theSmallestCheck ( List<Invoice> invoices ) {
        Optional<Invoice> minSum = invoices.stream ( )
                .min ( Comparator.comparing ( invoice -> invoice.goods.stream ( )
                        .sorted ( Comparator.comparing ( Goods::getPrice ) )
                        .mapToInt ( Goods::getPrice )
                        .sum ( ) ) );

        int getMinSum = minSum.stream ( )
                .flatMap ( x -> x.goods.stream ( ) )
                .mapToInt ( Goods::getPrice )
                .sum ( );

        Customer customer = minSum.get ( ).customer;

        return "The smallest check sum : " + getMinSum + " " + customer;
    }

    public static String allPurchasesSum ( List<Invoice> invoices ) {
        int sum = 0;
        sum = sum + invoices.stream ( )
                .flatMap ( x -> x.goods.stream ( ) )
                .mapToInt ( Goods::getPrice )
                .sum ( );

        return "All purchases sum : " + sum;
    }

    public static String retailChecks ( List<Invoice> invoices ) {
        int retail = (int) invoices.stream ( )
                .filter ( x -> ( x.type.equals ( Type.retail ) ) )
                .count ( );

        return "Retail checks: " + retail;
    }

    public static String oneTypeChecks ( List<Invoice> invoices ) {
        List<Invoice> telephoneList = invoices.stream ( )
                .filter ( x -> x.goods.toString ( ).contains ( "Telephone" ) )
                .filter ( x -> !x.goods.toString ( ).contains ( "Television" ) )
                .collect ( Collectors.toList ( ) );

        List<Invoice> televisionList = invoices.stream ( )
                .filter ( x -> x.goods.toString ( ).contains ( "Television" ) )
                .filter ( x -> !x.goods.toString ( ).contains ( "Telephone" ) )
                .collect ( Collectors.toList ( ) );

        return "One type checks: " + telephoneList + televisionList;
    }

    public static String firstThreeChecks ( List<Invoice> invoices ) {
        List<Invoice> firstThreeChecks = invoices.stream ( )
                .limit ( 3 )
                .collect ( Collectors.toList ( ) );

        return "First three checks: " + firstThreeChecks;
    }

    public static String checksUnder18 ( List<Invoice> invoices ) {
        List<Invoice> checksU18 = invoices.stream ( )
                .filter ( x -> ( x.customer.age ) < 18 )
                .collect ( Collectors.toList ( ) );

        return "Checks under 18: " + checksU18;
    }

    public static String sortChecks ( List<Invoice> invoices ) {
        List<Invoice> ageSort = invoices.stream ( )
                .sorted ( Comparator.comparing ( invoice -> invoice.customer.age ) )
                .collect ( Collectors.toList ( ) );

        Collections.reverse ( ageSort );

        List<Invoice> quantitySort = ageSort.stream ( )
                .sorted ( Comparator.comparing ( invoice -> (long) invoice.goods.size ( ) ) )
                .collect ( Collectors.toList ( ) );

        List<Invoice> totalSum = quantitySort.stream ( )
                .sorted ( Comparator.comparing ( invoice -> invoice.goods.stream ( )
                        .sorted ( Comparator.comparing ( Goods::getPrice ) )
                        .mapToInt ( Goods::getPrice )
                        .sum ( ) ) )
                .collect ( Collectors.toList ( ) );

        return "Sorted checks by age: " + ageSort
                + "\nSorted checks by quantity: " + quantitySort
                + "\nSorted checks by total sum: " + totalSum;
    }
}
