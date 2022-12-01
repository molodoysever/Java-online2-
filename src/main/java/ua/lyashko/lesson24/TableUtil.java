package ua.lyashko.lesson24;

import jakarta.persistence.Query;
import org.hibernate.Session;
import ua.lyashko.lesson24.entity.Device;
import ua.lyashko.lesson24.entity.Factory;
import ua.lyashko.lesson24.enums.DeviceName;
import ua.lyashko.lesson24.enums.DeviceType;
import ua.lyashko.lesson24.enums.FactoryCountry;
import ua.lyashko.lesson24.enums.FactoryName;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TableUtil {

    private static Date randomDate () {
        Random random = new Random ( );
        int minDay = (int) LocalDate.of ( 2010 , 1 , 1 ).toEpochDay ( );
        int maxDay = (int) LocalDate.of ( 2022 , 1 , 1 ).toEpochDay ( );
        long randomDay = minDay + random.nextInt ( maxDay - minDay );
        return Date.valueOf ( LocalDate.ofEpochDay ( randomDay ) );
    }

    public static void generateFactories ( Session session ) {
        Random random = new Random ( );
        for (int i = 0; i < 4; i++) {
            String tempName = String.valueOf (
                    FactoryName.values ( )[random.nextInt ( FactoryName.values ( ).length )] );
            String tempCountry = String.valueOf (
                    FactoryCountry.values ( )[random.nextInt ( FactoryCountry.values ( ).length )] );
            Factory factory = new Factory ( tempName , tempCountry );
            session.save ( factory );
        }
    }

    public static void generateDevices ( Session session ) {
        Random random = new Random ( );
        for (int i = 0; i < 10; i++) {
            String tempType = String.valueOf (
                    DeviceType.values ( )[random.nextInt ( DeviceType.values ( ).length )] );
            String tempName = String.valueOf (
                    DeviceName.values ( )[random.nextInt ( DeviceName.values ( ).length )] );
            int tempPrice = random.nextInt ( 1000 , 5000 );
            Date tempDate = randomDate ( );
            String tempDescription = "good " + tempName + " for best price: " + tempPrice;
            boolean tempBoolean = random.nextBoolean ( );
            int tempFactoryID = random.nextInt ( 1 , 4 );
            Factory factory = session.get ( Factory.class, tempFactoryID );
            Device device = new Device ( tempType , tempName , tempPrice , tempDate ,
                    tempDescription , tempBoolean , tempFactoryID , factory );
            session.save ( device );
        }
    }

    public static Device getInfo ( Session session , int deviceID ) {
        Device device = session.get ( Device.class , deviceID );
        System.out.println ( device );
        return device;
    }

    public static void changeData ( Session session , Device device ) {
        String deviceID = String.valueOf ( device.getDeviceID ( ) );
        Query query = session.createQuery ( "UPDATE Device set price = :priceParam, description = :description" + " where deviceID = :devID" );
        query.setParameter ( "priceParam" , "55" );
        query.setParameter ( "description" , "aaa" );
        query.setParameter ( "devID" , deviceID );
        query.executeUpdate ( );
    }

    public static void dropDevice ( Session session , int deviceID ) {
        Query query = session.createQuery ( "delete Device where deviceID = :param" );
        query.setParameter ( "param" , String.valueOf ( deviceID ) );
        query.executeUpdate ( );
    }

    public static void getAllDevicesByFactory ( Session session , int factoryID ) {
        Query query = session.createQuery ( "from Device where factoryID = :param" );
        query.setParameter ( "param" , String.valueOf ( factoryID ) );
        var deviceList = query.getResultList ( );
        System.out.println ( deviceList );
    }

    public static void getQuantityAndSum ( Session session ) {
        Query query = session.createQuery ( "select COUNT(deviceID), SUM (price) " +
                "from Device GROUP BY factoryID" );
        var deviceList = query.getResultList ( );
        for (Object o : deviceList) {
            Object[] row = (Object[]) o;
            System.out.println ( row[0] + " , " + row[1] );
        }
    }
}
