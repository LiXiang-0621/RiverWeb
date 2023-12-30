package org.tku.riverweb.entity;

import com.opencsv.bean.CsvBindByName;

public class TideTable {
    @CsvBindByName
    private long id;
    @CsvBindByName
    private String date;
    @CsvBindByName
    private String time;
    @CsvBindByName
    private int height_rel;
    @CsvBindByName
    private int height_abs;
    @CsvBindByName
    private String water_level;

    public TideTable(long id, String date, String time, int height_rel, int height_abs, String water_level) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.height_rel = height_rel;
        this.height_abs = height_abs;
        this.water_level = water_level;
    }
}
