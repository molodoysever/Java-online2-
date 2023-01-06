package ua.lyashko.module2UpTo8;

public class Pipeline extends Factory implements Task {

    public Pipeline ( String factoryName , String workerName , long requiredTime ) {
        super ( factoryName , workerName , requiredTime );
    }

    public void layPipes () {
        try {
            Thread.sleep ( getRequiredTime ( ) );
        } catch ( InterruptedException e ) {
            e.printStackTrace ( );
        }
        System.out.println ( "pipes are layered" );
    }

    @Override
    public void requiredTime () {
        System.out.println ( getWorkerName ( ) + " will finish in: " + getRequiredTime ( ) + " sec" );
    }

    @Override
    public void doWork () {
        System.out.println ( "Laying pipes..." );
    }
}
