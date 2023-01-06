package ua.lyashko;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main ( String[] args ) {
        Connection connection = null;
        String user = "root";
        String password = "Password123!";
        String url = "jdbc:mariadb://localhost:3306/";

        try {
            connection = DriverManager.getConnection ( url, user, password );
            if (connection.isClosed ()) {
                System.out.println ("connection closed" );
            } else {
                Statement statement = connection.createStatement ();
                String str = "CREATE database Hello;";
                statement.executeUpdate ( str );
            }
        } catch ( SQLException e ) {
            e.printStackTrace ( );
        }
    }
}
