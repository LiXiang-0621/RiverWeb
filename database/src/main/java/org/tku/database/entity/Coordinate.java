package org.tku.database.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "Coordinate")
public class Coordinate{

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "latitude")
    private float lat;
    @Column(name = "longitude")
    private float lon;
    @Column(name = "number")
    private int number;
    @Column(name = "markerlabel")
    private String label;
    @Column(name="type")
    private String type;
}
