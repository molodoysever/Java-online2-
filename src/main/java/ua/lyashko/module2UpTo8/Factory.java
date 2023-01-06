package ua.lyashko.module2UpTo8;

public abstract class Factory {
    private final String factoryName;
    private final String workerName;
    private final long requiredTime;

    public Factory ( String factoryName , String workerName , long requiredTime ) {
        this.factoryName = factoryName;
        this.workerName = workerName;
        this.requiredTime = requiredTime;
    }

    public String getWorkerName () {
        return workerName;
    }

    public long getRequiredTime () {
        return requiredTime;
    }

    @Override
    public String toString () {
        return "Factory{" +
                "factoryName='" + factoryName + '\'' +
                ", workerName='" + workerName + '\'' +
                ", requiredTime=" + requiredTime +
                '}';
    }
}
