package ua.lyashko.task2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    public static void main ( String[] args ) {
        Connection connection = null;
        String user = "root";
        String password = "Password123!";
        String url = "jdbc:mariadb://localhost:3306/";
        try {
            connection = DriverManager.getConnection ( url, user, password);
            Statement statement = connection.createStatement ( );
            String str = "CREATE database Hello;";
            statement.executeUpdate ( str );
        } catch ( SQLException e ) {
            e.printStackTrace ( );
        }
    }
}
