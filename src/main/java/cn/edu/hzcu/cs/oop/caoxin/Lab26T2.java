//package cn.edu.hzcu.cs.oop.caoxin;
//
//public class Lab26T2 {
//    public static void main(String[] args) {
//        ComparableCircle circle1 = new ComparableCircle(5);
//        ComparableCircle circle2 = new ComparableCircle(15);
//        ComparableCircle circle3 = Max.max(circle1, circle2);
//        System.out.println("The max circle's radius is " + circle3.getRadius());
//    }
//}
//
//abstract class GeometricObject {
//  private String color = "white";
//  private boolean filled;
//  private java.util.Date dateCreated;
//
//  protected GeometricObject() {
//    dateCreated = new java.util.Date();
//  }
//
//  protected GeometricObject(String color, boolean filled) {
//    dateCreated = new java.util.Date();
//    this.color = color;
//    this.filled = filled;
//  }
//
//  public String getColor() {
//    return color;
//  }
//
//  public void setColor(String color) {
//    this.color = color;
//  }
//
//  public boolean isFilled() {
//    return filled;
//  }
//
//  public void setFilled(boolean filled) {
//    this.filled = filled;
//  }
//
//  public java.util.Date getDateCreated() {
//    return dateCreated;
//  }
//
//  public String toString() {
//    return "created on " + dateCreated + "\ncolor: " + color +
//      " and filled: " + filled;
//  }
//
//  public abstract double getArea();
//
//  public abstract double getPerimeter();
//
//  public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
//    return o1.getArea() >= o2.getArea() ? o1 : o2;
//  }
//}
//
//class Circle extends GeometricObject {
//  private double radius;
//
//  public Circle() {
//  }
//
//  public Circle(double radius) {
//    this.radius = radius;
//  }
//
//  public double getRadius() {
//    return radius;
//  }
//
//  public void setRadius(double radius) {
//    this.radius = radius;
//  }
//
//  @Override
//  public double getArea() {
//    return radius * radius * Math.PI;
//  }
//
//  public double getDiameter() {
//    return 2 * radius;
//  }
//
//  @Override
//  public double getPerimeter() {
//    return 2 * radius * Math.PI;
//  }
//
//  public void printCircle() {
//    System.out.println("The circle is created " + getDateCreated() +
//      " and the radius is " + radius);
//  }
//}
//
//class Rectangle extends GeometricObject {
//  private double width;
//  private double height;
//
//  public Rectangle() {
//  }
//
//  public Rectangle(double width, double height) {
//    this.width = width;
//    this.height = height;
//  }
//
//  public double getWidth() {
//    return width;
//  }
//
//  public void setWidth(double width) {
//    this.width = width;
//  }
//
//  public double getHeight() {
//    return height;
//  }
//
//  public void setHeight(double height) {
//    this.height = height;
//  }
//
//  @Override
//  public double getArea() {
//    return width * height;
//  }
//
//  @Override
//  public double getPerimeter() {
//    return 2 * (width + height);
//  }
//}
//
//class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
//    public ComparableCircle() {
//        super();
//    }
//
//    public ComparableCircle(double radius) {
//        super(radius);
//    }
//
//    @Override
//    public int compareTo(ComparableCircle o) {
//        return Double.compare(this.getRadius(), o.getRadius());
//    }
//}
//
//class Max {
//    public static ComparableCircle max(ComparableCircle c1, ComparableCircle c2) {
//        return c1.compareTo(c2) >= 0 ? c1 : c2;
//    }
//}
