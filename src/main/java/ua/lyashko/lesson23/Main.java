package ua.lyashko.lesson23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main ( String[] args ) {
        Connection connection = null;
        String user = "root";
        String password = "root";
        String url = "jdbc:mariadb://localhost:3306/lesson23";

        try {
            connection = DriverManager.getConnection ( url, user, password);
            CreateTable.CreateFactoryTable ( connection );
            CreateTable.CreateDeviceTable ( connection );
            TableUtil.generateFactories ( connection );
            TableUtil.generateDevices ( connection );

            Device device =  TableUtil.getInformation ( connection, 5 );

            TableUtil.changeData ( connection, device );
            TableUtil.dropDevice ( connection, 3 );
            TableUtil.getAllDevicesByFactory ( connection, 2 );
            TableUtil.getQuantityAndSum ( connection );
        } catch ( SQLException e ) {
            e.printStackTrace ( );
        }

    }
}