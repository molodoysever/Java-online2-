package ua.lyashko.module2UpTo8;

public class Carpentry extends Factory implements Task {

    public Carpentry ( String factoryName , String workerName , long requiredTime ) {
        super ( factoryName , workerName , requiredTime );
    }

    public void fixRoof () {
        try {
            Thread.sleep ( getRequiredTime ( ) );
        } catch ( InterruptedException e ) {
            e.printStackTrace ( );
        }
        System.out.println ( "roof fixed" );
    }

    @Override
    public void requiredTime () {
        System.out.println ( getWorkerName ( ) + " will finish in: " + getRequiredTime ( ) + " sec" );
    }

    @Override
    public void doWork () {
        System.out.println ( "Fixing a roof..." );
    }
}
