//package cn.edu.hzcu.cs.oop.caoxin;
//
//import java.util.ArrayList;
//import java.util.Date;
//
//class Loan {
//    private double amount;
//
//    public Loan(double amount) {
//        this.amount = amount;
//    }
//
//    @Override
//    public String toString() {
//        return "Loan@" + Integer.toHexString(hashCode());
//    }
//}
//
//class Circle {
//    private double radius;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    public String toString() {
//        return "Circle@" + Integer.toHexString(hashCode());
//    }
//}
//
//public class Lab18T2 {
//    public static void main(String[] args) {
//        ArrayList<Object> list = new ArrayList<>();
//
//        list.add(new Loan(1000));
//        list.add(new Date());
//        list.add("hello");
//        list.add(new Circle(5));
//
//        for (Object obj : list) {
//            System.out.println(obj.toString());
//        }
//    }
//}
