package cn.edu.hzcu.cs.oop.caoxin;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab16T2 {
    public static Integer min(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return null;
        }

        Integer minValue = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < minValue) {
                minValue = list.get(i);
            }
        }
        return minValue;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter numbers (end with 0):");
        while (true) {
            int value = input.nextInt();
            if (value == 0) {
                break;
            }
            list.add(value);
        }

        Integer result = min(list);

        if (result == null) {
            System.out.println("The list is empty or null.");
        } else {
            System.out.println("The minimum number is " + result);
        }

        input.close();
    }
}
