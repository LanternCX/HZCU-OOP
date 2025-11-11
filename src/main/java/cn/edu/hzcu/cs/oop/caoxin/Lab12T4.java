package cn.edu.hzcu.cs.oop.caoxin;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Lab12T4 {
    public static void main(String[] args) {
        MathContext mc = new MathContext(25, RoundingMode.HALF_UP);
        System.out.printf("%-10s%-40s\n", "i", "Approximation of e");
        for (int i = 100; i <= 1000; i += 100) {
            System.out.printf("%-10d%-40s\n", i, computeE(i, mc));
        }
    }

    public static BigDecimal computeE(int n, MathContext mc) {
        BigDecimal e = BigDecimal.ONE;
        BigDecimal factorial = BigDecimal.ONE;
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigDecimal.valueOf(i), mc);
            e = e.add(BigDecimal.ONE.divide(factorial, mc), mc);
        }
        return e;
    }
}