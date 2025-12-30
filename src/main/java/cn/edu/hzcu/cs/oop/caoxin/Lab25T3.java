package cn.edu.hzcu.cs.oop.caoxin;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Lab25T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input the year:");
        int year = sc.nextInt();
        System.out.println("please input the month:");
        int month = sc.nextInt();
        String[] names = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        GregorianCalendar cal = new GregorianCalendar(year, month - 1, 1);
        int firstWeekDay = cal.get(Calendar.DAY_OF_WEEK);
        int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println("        " + names[month - 1] + ", " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 1; i < firstWeekDay; i++) {
            System.out.print("    ");
        }
        int dayOfWeek = firstWeekDay;
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d", day);
            if (dayOfWeek == Calendar.SATURDAY) {
                System.out.println();
                dayOfWeek = Calendar.SUNDAY;
            } else {
                System.out.print(" ");
                dayOfWeek++;
            }
        }
        if (dayOfWeek != Calendar.SUNDAY) {
            System.out.println();
        }
        sc.close();
    }
}
