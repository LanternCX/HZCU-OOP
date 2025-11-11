package cn.edu.hzcu.cs.oop.caoxin;

import java.util.GregorianCalendar;

class MyDate {
    private int year;
    private int month;
    private int day;
    public MyDate() {
        GregorianCalendar gc = new GregorianCalendar();
        year = gc.get(GregorianCalendar.YEAR);
        month = gc.get(GregorianCalendar.MONTH);
        day = gc.get(GregorianCalendar.DAY_OF_MONTH);
    }
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    public void setDate(long elapsedTime) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTimeInMillis(elapsedTime);
        year = gc.get(GregorianCalendar.YEAR);
        month = gc.get(GregorianCalendar.MONTH);
        day = gc.get(GregorianCalendar.DAY_OF_MONTH);
    }
}

public class Lab12T2 {
    public static void main(String[] args) {
        java.util.Date date1 = new java.util.Date();
        java.util.Date date2 = new java.util.Date(34355555133101L);
        System.out.println(date1.getHours() + ":" + date1.getMinutes() + ":" + date1.getSeconds());
        System.out.println(date2.getHours() + ":" + date2.getMinutes() + ":" + date2.getSeconds());
    }
}