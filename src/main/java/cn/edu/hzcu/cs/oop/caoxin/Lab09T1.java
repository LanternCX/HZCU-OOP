package cn.edu.hzcu.cs.oop.caoxin;

import java.time.LocalTime;

class Time {
    private int hour;
    private int minute;
    private int second;

    Time () {
        long timeMillis = System.currentTimeMillis();
        setTime(timeMillis);
    }

    Time (int timeMillis) {
        setTime(timeMillis);
    }

    public void setTime(long elapseTime) {
        long sec = elapseTime / 1000;
        this.second = (int) sec % 60;
        long min = sec / 60;
        this.minute = (int) min % 60;
        long hour = min / 60;
        this.hour = (int) hour % 24;
    }

    int getHour() {
        return hour;
    }

    int getMinute() {
        return minute;
    }

    int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("Hour: %d Minute %d Second %d", this.hour, this.minute, this.second);
    }
}

public class Lab09T1 {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);

        System.out.println(time1);
        System.out.println(time2);
    }
}
