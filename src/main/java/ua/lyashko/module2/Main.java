package ua.lyashko.module2;

import ua.lyashko.module2.entity.Invoice;
import ua.lyashko.module2.services.AnalyticalData;
import ua.lyashko.module2.services.ShopService;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) throws FileNotFoundException {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Enter the limit" );

        int limit = scanner.nextInt ( );

        List<Invoice> invoices = ShopService.invoices ( limit );

        System.out.println ( AnalyticalData.soldByCategory ( invoices ) );
        System.out.println ( AnalyticalData.theSmallestCheck ( invoices ) );
        System.out.println ( AnalyticalData.allPurchasesSum ( invoices ) );
        System.out.println ( AnalyticalData.retailChecks ( invoices ) );
        System.out.println ( AnalyticalData.oneTypeChecks ( invoices ) );
        System.out.println ( AnalyticalData.firstThreeChecks ( invoices ) );
        System.out.println ( AnalyticalData.checksUnder18 ( invoices ) );
        System.out.println ( AnalyticalData.sortChecks ( invoices ) );
    }
}
