package ua.lyashko.module2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ShopService {

    public static List<Goods> readFromCSVtoList () throws MyException {
        File file = new File ( "Goods.csv" );
        Scanner scanner = null;
        try {
            scanner = new Scanner ( file );
        } catch ( FileNotFoundException e ) {
            e.printStackTrace ( );
        }
        List<Goods> goods = new ArrayList<> ( );

        while ( true ) {
            assert scanner != null;
            if (!scanner.hasNext ( )) break;
            String line = scanner.nextLine ( );
            String[] items = line.split ( "," );

            for (int i = 0; i < items.length; i++) {
                Television television = new Television ( "" , 0 , "" , "" , 0 );
                Telephone telephone = new Telephone ( "" , "" , "" , 0 );

                if (items[0].contains ( "Television" )) {
                    television.series = items[1];
                    television.diagonal = Integer.parseInt ( items[3] );
                    television.screenType = items[4];
                    television.country = items[5];
                    television.price = Integer.parseInt ( items[6] );
                    goods.add ( television );
                } else if (items[0].contains ( "Telephone" )) {
                    telephone.series = items[1];
                    telephone.model = items[2];
                    telephone.screenType = items[4];
                    telephone.price = Integer.parseInt ( items[6] );
                    goods.add ( telephone );
                }
            }
        }
        scanner.close ( );
        return goods;
    }

    public static Invoice createInvoice ( int limit ) throws MyException {
        List<Goods> goods = randomOrder ( readFromCSVtoList ( ) );
        Customer customer = PersonService.generateCustomer ( );
        Type type = Type.retail;

        int totalPrice = 0;

        for (Goods good : goods) {
            totalPrice += good.price;
        }

        if (totalPrice > limit) {
            type = Type.wholesale;
        }

        log ( customer , goods );
        return new Invoice ( goods , customer , type );
    }

    public static List<Goods> randomOrder ( List<Goods> goods ) {
        Random random = new Random ( );
        List<Goods> randomOrder = new ArrayList<> ( );
        int randomNum = random.nextInt ( 1 , 5 );
        for (int i = 0; i < randomNum; i++) {
            randomOrder.add ( goods.get ( random.nextInt ( goods.size ( ) ) ) );
        }
        return randomOrder;
    }

    public static void log ( Customer customer , List<Goods> goods ) {
        SimpleDateFormat formatter = new SimpleDateFormat ( "yyyy-MM-dd 'at' HH:mm:ss z" );
        Date date = new Date ( System.currentTimeMillis ( ) );

        try (FileWriter writer = new FileWriter ( "log.txt" , true )) {
            writer.write ( String.valueOf ( date ) );
            writer.write ( String.valueOf ( customer ) );
            writer.write ( String.valueOf ( goods ) );
            writer.flush ( );
        } catch ( IOException ex ) {
            System.out.println ( ex.getMessage ( ) );
        }
    }

    public static List<Invoice> invoices ( int limit ) throws FileNotFoundException {
        List<Invoice> invoices = new ArrayList<> ( );

        invoices.add ( createInvoice ( limit ) );
        invoices.add ( createInvoice ( limit ) );
        invoices.add ( createInvoice ( limit ) );
        invoices.add ( createInvoice ( limit ) );
        invoices.add ( createInvoice ( limit ) );
        invoices.add ( createInvoice ( limit ) );
        invoices.add ( createInvoice ( limit ) );
        invoices.add ( createInvoice ( limit ) );
        invoices.add ( createInvoice ( limit ) );
        invoices.add ( createInvoice ( limit ) );
        invoices.add ( createInvoice ( limit ) );
        invoices.add ( createInvoice ( limit ) );
        invoices.add ( createInvoice ( limit ) );
        invoices.add ( createInvoice ( limit ) );
        invoices.add ( createInvoice ( limit ) );

        return invoices;
    }
}
