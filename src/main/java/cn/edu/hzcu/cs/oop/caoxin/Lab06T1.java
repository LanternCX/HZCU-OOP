package cn.edu.hzcu.cs.oop.caoxin;

import java.util.Date;

public class Lab06T1 {
    public static void main(String[] args) {
        for (int i = 4; i < 10; i++) {
            System.out.println(new Date((int)Math.pow(10, i)));
        }
    }
}
