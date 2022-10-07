package ua.lyashko.lesson12.task4;

import java.util.Optional;

public class PhoneBook {
    private static final String[] PHONE_BOOK = new String[3];

    public static void main ( String[] args ) {
        PHONE_BOOK[0] = "016/161616";
        PHONE_BOOK[1] = "016/161617";
        PHONE_BOOK[2] = "016/161618";

        PhoneBook phoneBook = new PhoneBook ( );
        System.out.println ( phoneBook.findIndexByPhoneNumber ( "016/161618" ) );
    }


    public Optional<Integer> findIndexByPhoneNumber ( String phoneNumber ) {
        int temp;
        for (int i = 0; i < PHONE_BOOK.length; i++) {
            if (phoneNumber.equals ( PHONE_BOOK[i] )) {
                temp = i;
                return Optional.of ( temp );
            }
        }
        return Optional.empty ( );
    }
}
