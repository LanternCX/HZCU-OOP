package cn.edu.hzcu.cs.oop.caoxin;

import java.util.ArrayList;

public class Lab25T2 {
    public static void average(ArrayList<Number> list) {
        if (list == null || list.isEmpty()) {
            System.out.println(0);
            return;
        }
        double sum = 0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        System.out.println(sum / list.size());
    }

    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<Number>();
        int size = (int) (Math.random() * 10 + 1);
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * 10 + 1));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).doubleValue() + " ");
        }
        System.out.println();
        average(list);
    }
}
