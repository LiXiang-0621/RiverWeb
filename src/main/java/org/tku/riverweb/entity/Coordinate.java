package org.tku.riverweb.entity;

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
    private String id;
    @Column(name = "latitude")
    private String lat;
    @Column(name = "longitude")
    private String lon;
    @Column(name = "number")
    private String number;
    @Column(name = "markerlabel")
    private String email;
    @Column(name="type")
    private String roleId;
}
