//package cn.edu.hzcu.cs.oop.caoxin;
//
//import java.util.Scanner;
//import java.util.Date;
//
//public class Lab24T1 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("please input triangle's color:");
//        String color = input.next();
//
//        System.out.println("please input triangle's three sides:");
//        double s1 = input.nextDouble();
//        double s2 = input.nextDouble();
//        double s3 = input.nextDouble();
//
//        System.out.println("Is the triangle filled?true or false?");
//        boolean filled = input.nextBoolean();
//
//        if ((s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1)) {
//            Triangle triangle = new Triangle(s1, s2, s3);
//            triangle.setColor(color);
//            triangle.setFilled(filled);
//
//            System.out.println("The triangle's area is " + triangle.getArea());
//            System.out.println("The triangle's perimeter is " + triangle.getPerimeter());
//            System.out.println("The triangle's color is " + triangle.getColor());
//            System.out.println("Is the triangle filled? " + triangle.isFilled());
//        } else {
//            System.out.println("The three sides can not build a triangle!");
//        }
//
//        input.close();
//    }
//}
//
//abstract class GeometricObject {
//    private String color = "white";
//    private boolean filled;
//    private Date dateCreated;
//
//    protected GeometricObject() {
//        dateCreated = new Date();
//    }
//
//    protected GeometricObject(String color, boolean filled) {
//        dateCreated = new Date();
//        this.color = color;
//        this.filled = filled;
//    }
//
//    public String getColor() { return color; }
//    public void setColor(String color) { this.color = color; }
//
//    public boolean isFilled() { return filled; }
//    public void setFilled(boolean filled) { this.filled = filled; }
//
//    public Date getDateCreated() { return dateCreated; }
//
//    @Override
//    public String toString() {
//        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
//    }
//
//    public abstract double getArea();
//    public abstract double getPerimeter();
//}
//
//class Triangle extends GeometricObject {
//    private double side1 = 1.0;
//    private double side2 = 1.0;
//    private double side3 = 1.0;
//
//    public Triangle() {
//    }
//
//    public Triangle(double side1, double side2, double side3) {
//        this.side1 = side1;
//        this.side2 = side2;
//        this.side3 = side3;
//    }
//
//    @Override
//    public double getArea() {
//        double s = (side1 + side2 + side3) / 2.0;
//        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
//    }
//
//    @Override
//    public double getPerimeter() {
//        return side1 + side2 + side3;
//    }
//
//    @Override
//    public String toString() {
//        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
//    }
//}