package cn.edu.hzcu.cs.oop.caoxin;

import java.util.Scanner;
public class Lab02T1 {
    public static void main(String[] args) {
        double v0, v1, t;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter v0 (m/s), v1 (m/s) and t(s) :");

        v0 = input.nextDouble();
        v1 = input.nextDouble();
        t = input.nextDouble();

        double acc = (v1 - v0) / t;

        System.out.println("The average acceleration is : " + acc + " m/(s^2).");
    }
}
