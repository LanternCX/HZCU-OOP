package cn.edu.hzcu.cs.oop.caoxin;

import java.util.*;

class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double disc = getDiscriminant();
        if (disc >= 0) {
            return (-b + Math.sqrt(disc)) / (2 * a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        double disc = getDiscriminant();
        if (disc >= 0) {
            return (-b - Math.sqrt(disc)) / (2 * a);
        } else {
            return 0;
        }
    }
}


public class Lab08T3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation eq = new QuadraticEquation(a, b, c);
        double disc = eq.getDiscriminant();
        System.out.println("Discriminant: " + disc);

        if (disc > 0) {
            System.out.println("Root 1: " + eq.getRoot1());
            System.out.println("Root 2: " + eq.getRoot2());
        } else if (disc == 0) {
            System.out.println("Root: " + eq.getRoot1());
        } else {
            System.out.println("The equation has no roots.");
        }
    }
}
