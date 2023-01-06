package ua.lyashko.lesson19.task2;

import com.google.gson.annotations.SerializedName;

public class Box {

    private String from;
    private String material;
    private String color;

    @SerializedName("max-lifting-capacity")
    MaxLiftingCapacity maxLiftingCapacity;

    private Cargo cargo;

    @SerializedName("delivery-date")
    String deliveryDate;

    public String getFrom () {
        return from;
    }

    public void setFrom ( String from ) {
        this.from = from;
    }

    public String getMaterial () {
        return material;
    }

    public void setMaterial ( String material ) {
        this.material = material;
    }

    public String getColor () {
        return color;
    }

    public void setColor ( String color ) {
        this.color = color;
    }

    public MaxLiftingCapacity getMaxLiftingCapacity () {
        return maxLiftingCapacity;
    }

    public void setMaxLiftingCapacity ( MaxLiftingCapacity maxLiftingCapacity ) {
        this.maxLiftingCapacity = maxLiftingCapacity;
    }

    public Cargo getCargo () {
        return cargo;
    }

    public void setCargo ( Cargo cargo ) {
        this.cargo = cargo;
    }

    public String getDeliveryDate () {
        return deliveryDate;
    }

    public void setDeliveryDate ( String deliveryDate ) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString () {
        return "Box{" +
                "from='" + from + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", maxLiftingCapacity=" + maxLiftingCapacity +
                ", cargo=" + cargo +
                ", deliveryDate='" + deliveryDate + '\'' +
                '}';
    }
}
