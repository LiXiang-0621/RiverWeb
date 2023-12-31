package org.tku.database.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
@Entity
@Table(name = "Tide")
public class Tide {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "date")
    private Date date;
    @Column(name = "time")
    private Date time;
    @Column(name = "localAvgSeaLevel")
    private Integer avg_level;
    @Column(name="maxScaleReference")
    private Integer max_level;
    @Column(name="waterLevel")
    private String waterLevel;

}
