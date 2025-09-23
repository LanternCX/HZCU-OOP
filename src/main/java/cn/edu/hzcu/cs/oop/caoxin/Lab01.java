package cn.edu.hzcu.cs.oop.caoxin;

public class Lab01 {
    public static void main(String[] args) {
        long population = 312032486L;

        int seconds = 365 * 24 * 60 * 60;

        long births = seconds / 7;
        long deaths = seconds / 13;
        long immigrant = seconds / 45;

        for (int i = 1; i <= 5; i++) {
            population += births - deaths + immigrant;
            System.out.println("Population Year No." + i + ": " + population);
        }
    }
}