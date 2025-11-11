package cn.edu.hzcu.cs.oop.caoxin;

import java.util.Stack;

public class Lab11T3 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a integer: ");
        int number = input.nextInt();
        System.out.println("The factors for " + number + " is:");

        Stack<Integer> stack = new Stack<>();

        int factor = 2;
        while (number != 1) {
            if (number % factor == 0) {
                stack.push(factor);
                number /= factor;
            } else {
                factor++;
            }
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
