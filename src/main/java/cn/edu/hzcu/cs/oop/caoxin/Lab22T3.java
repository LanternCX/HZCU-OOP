package cn.edu.hzcu.cs.oop.caoxin;

import java.util.Scanner;

public class Lab22T3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int intValue = input.nextInt();
        double doubleValue = input.nextDouble();
        String line = input.nextLine();

        System.out.println("intValue = " + intValue);
        System.out.println("doubleValue = " + doubleValue);
        System.out.println("line = \"" + line + "\"");

        input.close();
    }
}
