package ua.lyashko.lesson15.task3;

public class Box {
    private final Integer volume;

    public Box ( int volume ) {
        this.volume = volume;
    }

    public Integer getVolume () {
        return volume;
    }

    @Override
    public String toString () {
        return "Box{" +
                "volume=" + volume +
                '}';
    }
}

