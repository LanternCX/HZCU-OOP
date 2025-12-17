package cn.edu.hzcu.cs.oop.caoxin;

public class Lab21T2 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter two integers: ");
        while (true) {
            try {
                int a = input.nextInt();
                int b = input.nextInt();
                System.out.println("Multiplication is " + (a * b));
                break;
            } catch (java.util.InputMismatchException ex) {
                System.out.print("Incorrect input and re-enter two integers: ");
                input.nextLine();
            }
        }
        input.close();
    }
}
