package com.example.dayplanner;

import android.content.Context;
import android.database.Cursor;

public class CalenderEventsClass
{
    private int id;
    private String username;
    private String name;
    private String date;
    private String time;
    private String type;
    private float expenssesPrice;
    private int index;

    public CalenderEventsClass(String username,String name,String date, String time, String type,float expenssesPrice,int id,int index)
    {
        this.username=username;
        this.name=name;
        this.date=date;
        this.time=time;
        this.type=type;
        this.expenssesPrice=expenssesPrice;
        this.id=id;
        this.index=index;
    }
    public CalenderEventsClass(String username,String name,String date, String time, String type,int id,int index)
    {
        this.username=username;
        this.name=name;
        this.date=date;
        this.time=time;
        this.type=type;
        this.id=id;
        this.index=index;
    }

    public float getExpenssesPrice() {
        return expenssesPrice;
    }

    public void setExpenssesPrice(float expenssesPrice) {
        this.expenssesPrice = expenssesPrice;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsernmae() {
        return username;
    }

    public void setUsernmae(String usernmae) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
