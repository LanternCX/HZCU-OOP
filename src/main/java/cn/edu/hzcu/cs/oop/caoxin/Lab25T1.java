package cn.edu.hzcu.cs.oop.caoxin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lab25T1 {
    public static void sort(ArrayList<Number> list) {
        Collections.sort(list, Comparator.comparingDouble(Number::doubleValue));
    }

    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(14);
        list.add(24);
        list.add(4);
        list.add(42);
        list.add(5);
        sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
