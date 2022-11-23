package ua.lyashko.lesson23;


import java.sql.*;

public class TableUtil {
    public static void generateDevices ( Connection connection ) {
        try {
            Statement statement = connection.createStatement ( );
            String createDevices = """
                    INSERT INTO Device ( type, name, price, manufactureDate, description, isAvailable, factoryID ) VALUES
                    ('TELEPHONE' , 'IPHONE 12', 1200, '2020-10-08', 'good phone, for sure...', 1, 1),
                    ('TV' , 'miTV 2', 1000, '2020-10-08', 'good tv, for sure...', 0, 3),
                    ('TELEPHONE' , 'Galaxy Note 9', 1300, '2010-12-10', 'good phone, for sure...', 1, 2),
                    ('RADIO' , 'radio', 250, '2020-10-08', 'good radio, for sure...', 1, 4),
                    ('POWERBOAT' , 'vroom-vroom', 7000, '2019-06-12', 'good boat, for sure...', 0, 2),
                    ('BATTERY' , 'ecol', 50, '2020-10-08', 'good battery, for sure...', 1, 4),
                    ('TELEPHONE' , 'RedMi Note 14', 700, '2022-08-04', 'good phone, for sure...', 1, 3),
                    ('FRIDGE' , 'AA 988322', 550, '2021-09-03', 'good fridge, for sure...', 1, 2),
                    ('LAPTOP' , 'MacBook PRO 10', 3000, '2017-11-11', 'good laptop, for sure...', 0, 1),
                    ('TELEPHONE' , 'Galaxy Fold', 820, '2006-01-01', 'good phone, for sure...', 0, 2);
                    """;
            statement.executeUpdate ( createDevices );
            statement.close ( );
        } catch ( SQLException e ) {
            e.printStackTrace ( );
        }
    }

    public static void generateFactories ( Connection connection ) {
        try {
            Statement statement = connection.createStatement ( );
            String createFactories = """
                    INSERT INTO Factory (name, country) VALUES
                    ('APPLE', 'USA'),
                    ('SAMSUNG', 'SOUTH KOREA'),
                    ('XIAOMI', 'CHINA'),
                    ('SONY', 'JAPAN');
                    """;
            statement.executeUpdate ( createFactories );
            statement.close ( );
        } catch ( SQLException e ) {
            e.printStackTrace ( );
        }
    }

    public static Device getInformation ( Connection connection , int deviceID ) {
        Device device = new Device ( );
        Factory factory = new Factory ( );
        try {
            Statement statement = connection.createStatement (
                    ResultSet.TYPE_FORWARD_ONLY ,
                    ResultSet.CONCUR_READ_ONLY );

            String getInformation = "SELECT * FROM Device WHERE deviceID = " + deviceID;
            ResultSet resultSet = statement.executeQuery ( getInformation );
            while ( resultSet.next ( ) ) {
                device.deviceID = Integer.parseInt ( resultSet.getString ( "deviceID" ) );
                device.type = resultSet.getString ( "type" );
                device.name = resultSet.getString ( "name" );
                device.price = Integer.parseInt ( resultSet.getString ( "price" ) );
                device.manufactureDate = Date.valueOf ( resultSet.getString ( "manufactureDate" ) );
                device.description = resultSet.getString ( "description" );
                device.isAvailable = Boolean.parseBoolean ( resultSet.getString ( "isAvailable" ) );
                device.factoryID = Integer.parseInt ( resultSet.getString ( "factoryID" ) );

                int factoryID = device.factoryID;

                String temp = "SELECT * FROM Factory WHERE factoryID = " + factoryID;
                resultSet = statement.executeQuery ( temp );
                resultSet.first ( );

                factory.factoryID = Integer.parseInt ( resultSet.getString ( "factoryID" ) );
                factory.country = resultSet.getString ( "country" );
                factory.name = resultSet.getString ( "name" );
                statement.close ( );
            }
        } catch ( SQLException e ) {
            e.printStackTrace ( );
        }
        System.out.println ( device );
        System.out.println ( factory );
        return device;
    }

    public static void changeData ( Connection connection , Device device ) {
        int deviceID = device.deviceID;
        String temp = "'blablabla'";
        device.description = temp;

        try {
            Statement statement = connection.createStatement ( );
            String str = "UPDATE Device SET description = " + temp + "WHERE deviceID = " + deviceID;
            statement.executeUpdate ( str );
            statement.close ( );
        } catch ( SQLException e ) {
            e.printStackTrace ( );
        }
    }

    public static void dropDevice ( Connection connection , int deviceID ) {
        try {
            Statement statement = connection.createStatement ( );
            String dropDevice = "DELETE FROM Device WHERE deviceID = " + deviceID;
            statement.executeUpdate ( dropDevice );
            statement.close ( );
        } catch ( SQLException e ) {
            e.printStackTrace ( );
        }
    }

    public static void getAllDevicesByFactory ( Connection connection , int factoryID ) {
        try {
            Statement statement = connection.createStatement ( );
            String str = "SELECT * FROM Factory, Device WHERE Factory.factoryID = Device.factoryID AND Factory.factoryID = " + factoryID;
            statement.executeQuery ( str );
            statement.close ( );
        } catch ( SQLException e ) {
            e.printStackTrace ( );
        }
    }

    public static void getQuantityAndSum ( Connection connection ) {
        try {
            Statement statement = connection.createStatement ( );
            String str = "SELECT COUNT(deviceID) , SUM(price)  FROM Device GROUP BY factoryID";
            statement.executeQuery ( str );
            statement.close ( );
        } catch ( SQLException e ) {
            e.printStackTrace ( );
        }
    }
}
