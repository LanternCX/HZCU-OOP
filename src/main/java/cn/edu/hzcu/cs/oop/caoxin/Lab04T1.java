package cn.edu.hzcu.cs.oop.caoxin;

import java.util.*;

public class Lab04T1 {
    public static void main(String[] args) {
        Random random = new Random();
        HashMap<Integer, Integer> cnt = new HashMap<>();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            cnt.put(i, 0);
        }
        for (int i = 0; i < 100; i++) {
            int rand = Math.abs(random.nextInt() % 10);
            nums.add(rand);
            cnt.put(rand, cnt.get(rand) + 1);
        }

        System.out.println("The digits are: ");
        for (int i = 0; i < 100; i++) {
            System.out.printf("%d%c", nums.get(i), (i + 1) % 10 == 0 ? '\n' : ' ');
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " occurrence times is: " + cnt.get(i));
        }
    }
}
