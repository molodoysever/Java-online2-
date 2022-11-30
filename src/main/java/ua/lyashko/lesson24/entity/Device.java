package ua.lyashko.lesson24.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "Device")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deviceID")
    int deviceID;

    @Column(name = "type")
    String type;

    @Column(name = "name")
    String name;

    @Column(name = "price")
    int price;

    @Column(name = "manufacture")
    Date manufactureDate;

    @Column(name = "description")
    String description;

    @Column(name = "isAvailable")
    boolean isAvailable;

    @Column(name = "factoryID")
    int factoryID;

    public Device ( String type , String name , int price , Date manufactureDate , String description , boolean isAvailable , int factoryID ) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.manufactureDate = manufactureDate;
        this.description = description;
        this.isAvailable = isAvailable;
        this.factoryID = factoryID;
    }
}
