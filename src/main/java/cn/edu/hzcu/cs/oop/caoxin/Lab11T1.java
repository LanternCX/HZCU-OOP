package cn.edu.hzcu.cs.oop.caoxin;

class MyInteger {
    int value;

    MyInteger (int value) {
        this.value = value;
    }

    int getValue() {
        return this.value;
    }

    static boolean isEven(int value) {
        return value % 2 == 0;
    }

    boolean isEven() {
        return MyInteger.isEven(this.value);
    }

    static boolean isOdd(int value) {
        return value % 2 == 1;
    }

    boolean isOdd() {
        return MyInteger.isOdd(this.value);
    }

    static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i * i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    boolean isPrime() {
        return MyInteger.isPrime(this.value);
    }

    boolean equals(int value) {
        return value == this.value;
    }

    boolean equals(MyInteger myInteger) {
        return myInteger.value == this.value;
    }

    static int parseInt(String str) {
        int mul = 1;
        int result = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            result += mul * (str.charAt(i) - '0');
            mul *= 10;
        }
        return result;
    }

    static int parseInt(char[] str) {
        return MyInteger.parseInt(String.copyValueOf(str));
    }
}

public class Lab11T1 {
    public static void main(String[] args) {
        MyInteger n1 = new MyInteger(5);
        System.out.println("n1 is even? " + n1.isEven());
        System.out.println("n1 is prime? " + n1.isPrime());
        System.out.println("15 is prime? " + MyInteger.isPrime(15));

        char[] chars = {'3', '5', '3', '9'};
        System.out.println(MyInteger.parseInt(chars));

        String s = "3539";
        System.out.println(MyInteger.parseInt(s));

        MyInteger n2 = new MyInteger(24);
        System.out.println("n2 is odd? " + n2.isOdd());
        System.out.println("45 is odd? " + MyInteger.isOdd(45));
        System.out.println("n1 is equal to n2? " + n1.equals(n2));
        System.out.println("n1 is equal to 5? " + n1.equals(5));
    }
}
