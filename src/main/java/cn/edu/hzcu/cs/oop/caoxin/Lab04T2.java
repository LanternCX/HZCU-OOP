package cn.edu.hzcu.cs.oop.caoxin;

import java.util.*;

public class Lab04T2 {
    public static int average(int[] array) {
        // 理论上应该返回 double 但是文档里面写明了要用 int 我只好这么写
        int sum = 0;
        for (int x : array) {
            sum += x;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double x : array) {
            sum += x;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 double values: ");
        double[] array = new double[10];
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextDouble();
        }
        System.out.printf("Avg of 10 = %.2f\n", average(array));
    }
}