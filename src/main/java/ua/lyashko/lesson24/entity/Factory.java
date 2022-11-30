package ua.lyashko.lesson24.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Factory")
public class Factory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "factoryID")
    int factoryID;

    @Column(name = "name")
    String name;

    @Column(name = "country")
    String country;


    public Factory ( String name , String country ) {
        this.name = name;
        this.country = country;
    }
}
