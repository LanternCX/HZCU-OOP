package cn.edu.hzcu.cs.oop.caoxin;

import java.util.Random;

public class Lab06T2 {
    public static void main(String[] args) {
        Random random = new Random(1000);
        for (int i = 0; i < 50; i++) {
            System.out.printf("%d%c", random.nextInt(100), (i + 1) % 10 == 0 ? '\n' : ' ');
        }
    }
}
