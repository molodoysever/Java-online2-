package ua.lyashko.module2UpTo8;

public class Sawmill extends Factory implements Task {

    public Sawmill ( String factoryName , String workerName , long requiredTime ) {
        super ( factoryName , workerName , requiredTime );
    }

    public void sawTree () {
        try {
            Thread.sleep ( getRequiredTime ( ) );
        } catch ( InterruptedException e ) {
            e.printStackTrace ( );
        }
        System.out.println ( "tree sowed" );
    }

    @Override
    public void requiredTime () {
        System.out.println ( getWorkerName ( ) + " will finish in: " + getRequiredTime ( ) + " sec" );
    }

    @Override
    public void doWork () {
        System.out.println ( "Sawing a tree..." );
    }
}
