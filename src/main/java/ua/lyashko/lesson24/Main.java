package ua.lyashko.lesson24;


import org.hibernate.Session;
import org.hibernate.Transaction;
import ua.lyashko.lesson24.entity.Device;


public class Main {
    public static void main ( String[] args ) {
        Session session = HibernateUtil.getSessionFactory ( ).openSession ( );
        Transaction transaction = session.beginTransaction ( );
        TableUtil.generateFactories ( session );
        TableUtil.generateDevices ( session );
        Device device = TableUtil.getInfo ( session , 5 );
        TableUtil.changeData ( session , device );
        TableUtil.dropDevice ( session , 3 );
        TableUtil.getAllDevicesByFactory ( session , 2 );
        TableUtil.getQuantityAndSum ( session );
        transaction.commit ( );
    }
}