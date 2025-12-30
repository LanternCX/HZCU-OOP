//package cn.edu.hzcu.cs.oop.caoxin;
//
//public class Lab26T1 {
//    public static void main(String[] args) {
//        GeometricObject o1 = new Circle(5);
//        GeometricObject o2 = new Rectangle(3, 4);
//        GeometricObject o3 = new Rectangle(5, 6);
//        GeometricObject o4 = new Circle(2);
//
//        System.out.println("the max of o1 and o2 is: " + GeometricObject.max(o1, o2));
//        System.out.println("the max of o3 and o4 is: " + GeometricObject.max(o3, o4));
//    }
//}

//abstract class GeometricObject implements Comparable<GeometricObject> {
//    private String color = "white";
//    private boolean filled;
//    private java.util.Date dateCreated;
//
//    protected GeometricObject() {
//        dateCreated = new java.util.Date();
//    }
//
//    protected GeometricObject(String color, boolean filled) {
//        dateCreated = new java.util.Date();
//        this.color = color;
//        this.filled = filled;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public boolean isFilled() {
//        return filled;
//    }
//
//    public void setFilled(boolean filled) {
//        this.filled = filled;
//    }
//
//    public java.util.Date getDateCreated() {
//        return dateCreated;
//    }
//
//    public String toString() {
//        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
//    }
//
//    public abstract double getArea();
//
//    public abstract double getPerimeter();
//
//    @Override
//    public int compareTo(GeometricObject o) {
//        return Double.compare(this.getArea(), o.getArea());
//    }
//
//    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
//        return o1.compareTo(o2) >= 0 ? o1 : o2;
//    }
//}
//
//class Circle extends GeometricObject {
//    private double radius;
//
//    public Circle() {
//    }
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    public double getRadius() {
//        return radius;
//    }
//
//    public void setRadius(double radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    public double getArea() {
//        return radius * radius * Math.PI;
//    }
//
//    public double getDiameter() {
//        return 2 * radius;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 2 * radius * Math.PI;
//    }
//
//    public void printCircle() {
//        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
//    }
//
//    @Override
//    public String toString() {
//        return getClass().getSimpleName();
//    }
//}
//
//class Rectangle extends GeometricObject {
//    private double width;
//    private double height;
//
//    public Rectangle() {
//    }
//
//    public Rectangle(double width, double height) {
//        this.width = width;
//        this.height = height;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public void setHeight(double height) {
//        this.height = height;
//    }
//
//    @Override
//    public double getArea() {
//        return width * height;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 2 * (width + height);
//    }
//
//    @Override
//    public String toString() {
//        return getClass().getSimpleName();
//    }
//}
