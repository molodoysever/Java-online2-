package ua.lyashko.lesson23;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void CreateDeviceTable ( Connection connection ) {
        try {
            Statement statement = connection.createStatement ( );
            String createDeviceTable = """
                    CREATE TABLE Device (
                       deviceID INT AUTO_INCREMENT PRIMARY KEY,
                       type VARCHAR(30),
                       name VARCHAR(30),
                       price INT,
                       manufactureDate DATE,
                       description VARCHAR(10000),
                       isAvailable BIT(0),
                       factoryID INT,
                       FOREIGN KEY (factoryID)
                       REFERENCES Factory (factoryID)
                       );""";
            statement.executeUpdate ( createDeviceTable );
        } catch ( SQLException throwables ) {
            throwables.printStackTrace ( );
        }
    }

    public static void CreateFactoryTable ( java.sql.Connection connection ) {
        try {
            Statement statement = connection.createStatement ( );
            String createFactoryTable = """
                    CREATE TABLE Factory (
                       factoryID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(30),
                       country VARCHAR(30)
                       );""";
            statement.executeUpdate ( createFactoryTable );
        } catch ( SQLException throwables ) {
            throwables.printStackTrace ( );
        }
    }
}
