package cn.edu.hzcu.cs.oop.caoxin;

import java.util.GregorianCalendar;

public class Lab06T3 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        for (int i = 0; i < 2; i++) {
            System.out.println("Year is " + calendar.get(GregorianCalendar.YEAR));
            System.out.println("Month is " + calendar.get(GregorianCalendar.MONTH));
            System.out.println("Date is " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
            calendar.setTimeInMillis(1234567898765L);
        }
    }
}
