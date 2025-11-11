package cn.edu.hzcu.cs.oop.caoxin;

import java.math.BigInteger;

public class Lab12T3 {
    public static void main(String[] args) {
        System.out.printf("%-8s%-30s\n", "p", "2^p - 1");
        for (int p = 2; p <= 100; p++) {
            BigInteger m = BigInteger.valueOf(2).pow(p).subtract(BigInteger.ONE);
            if (isPrime(m))
                System.out.printf("%-8d%-30s\n", p, m);
        }
    }

    public static boolean isPrime(BigInteger num) {
        if (num.compareTo(BigInteger.TWO) < 0) return false;
        BigInteger i = BigInteger.TWO;
        while (i.multiply(i).compareTo(num) <= 0) {
            if (num.mod(i).equals(BigInteger.ZERO)) return false;
            i = i.add(BigInteger.ONE);
        }
        return true;
    }
}
