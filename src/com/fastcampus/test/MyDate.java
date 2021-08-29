package com.fastcampus.test;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class MyDate {
    private int day;
    private int month;
    private int year;
    private boolean isValid = true;

    public MyDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isDate() {
        SimpleDateFormat transform = new SimpleDateFormat("yyyyMMdd");
        String strDate = getYear() + String.format("%02d", getMonth()) + String.format("%02d", getDay());
        try {
            transform.setLenient(false);
            transform.parse(strDate);
        }
        catch (Exception e) {
            isValid = false;
        }
        return isValid;
    }
}
