package ua.lyashko.module2;

import java.util.Random;

public class PersonService {
    public static Customer generateCustomer () {
        Random random = new Random ( );
        Customer customer = new Customer ( 0 , " " , 0 );
        customer.id = random.nextInt ( 100_000_0 );
        customer.email = generateEmail ( );
        customer.age = random.nextInt ( 10 , 95 );
        return customer;
    }

    private static String generateEmail () {
        StringBuilder emailAddress = new StringBuilder ( );
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        while ( emailAddress.length ( ) < 5 ) {
            int character = (int) ( Math.random ( ) * 26 );
            emailAddress.append ( alphabet.charAt ( character ) );
        }
        emailAddress.append ( Integer.valueOf ( (int) ( Math.random ( ) * 99 ) )
                .toString ( ) );
        emailAddress.append ( "@gmail.com" );
        return emailAddress.toString ( );
    }
}
