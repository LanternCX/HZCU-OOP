package cn.edu.hzcu.cs.oop.caoxin;

import java.util.Scanner;

public class Lab02T2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter monthly saving amount: ");
        double saving = input.nextDouble();

        double annualRate = 0.05;
        double monthlyRate = annualRate / 12;

        double total = 0;

        for (int i = 1; i <= 6; i++) {
            total = (saving + total) * (1 + monthlyRate);
        }

        System.out.println("After the sixth month, the account value is : " + total);
    }
}
