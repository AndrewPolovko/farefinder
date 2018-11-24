package com.belavia.fare.fare.db;

import android.arch.persistence.room.Entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@Entity(tableName = "Samplee")
public class Samplee  {

    public static final String SPECIAL_ID = "specialId";

    @Expose
    @SerializedName(SPECIAL_ID)
    private String name;

    private long startTime;
    private long endTime;

}
