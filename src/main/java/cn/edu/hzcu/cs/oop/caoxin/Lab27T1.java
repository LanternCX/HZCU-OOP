//package cn.edu.hzcu.cs.oop.caoxin;
//
//// Colorable interface
//interface Colorable {
//    void howToColor();
//}
//
//// GeometricObject copied (package-private)
//abstract class GeometricObject {
//  private String color = "white";
//  private boolean filled;
//  private java.util.Date dateCreated;
//
//  /** Construct a default geometric object */
//  protected GeometricObject() {
//    dateCreated = new java.util.Date();
//  }
//
//  /** Construct a geometric object with color and filled value */
//  protected GeometricObject(String color, boolean filled) {
//    dateCreated = new java.util.Date();
//    this.color = color;
//    this.filled = filled;
//  }
//
//  /** Return color */
//  public String getColor() {
//    return color;
//  }
//
//  /** Set a new color */
//  public void setColor(String color) {
//    this.color = color;
//  }
//
//  /** Return filled. Since filled is boolean,
//   *  the get method is named isFilled */
//  public boolean isFilled() {
//    return filled;
//  }
//
//  /** Set a new filled */
//  public void setFilled(boolean filled) {
//    this.filled = filled;
//  }
//
//  /** Get dateCreated */
//  public java.util.Date getDateCreated() {
//    return dateCreated;
//  }
//
//  /** Return a string representation of this object */
//  public String toString() {
//    return "created on " + dateCreated + "\ncolor: " + color +
//      " and filled: " + filled;
//  }
//
//  /** Abstract method getArea */
//  public abstract double getArea();
//
//  /** Abstract method getPerimeter */
//  public abstract double getPerimeter();
//}
//
//// Circle copied (package-private)
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
//  /** Return radius */
//  public double getRadius() {
//    return radius;
//  }
//
//  /** Set a new radius */
//  public void setRadius(double radius) {
//    this.radius = radius;
//  }
//
//  @Override /** Return area */
//  public double getArea() {
//    return radius * radius * Math.PI;
//  }
//
//  /** Return diameter */
//  public double getDiameter() {
//    return 2 * radius;
//  }
//
//  @Override /** Return perimeter */
//  public double getPerimeter() {
//    return 2 * radius * Math.PI;
//  }
//
//  /* Print the circle info */
//  public void printCircle() {
//    System.out.println("The circle is created " + getDateCreated() +
//      " and the radius is " + radius);
//  }
//
//  @Override
//  public String toString() {
//    // Return concise name so output matches the example
//    return "Circle";
//  }
//}
//
//// Rectangle copied (package-private)
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
//  /** Return width */
//  public double getWidth() {
//    return width;
//  }
//
//  /** Set a new width */
//  public void setWidth(double width) {
//    this.width = width;
//  }
//
//  /** Return height */
//  public double getHeight() {
//    return height;
//  }
//
//  /** Set a new height */
//  public void setHeight(double height) {
//    this.height = height;
//  }
//
//  @Override /** Return area */
//  public double getArea() {
//    return width * height;
//  }
//
//  @Override /** Return perimeter */
//  public double getPerimeter() {
//    return 2 * (width + height);
//  }
//
//  @Override
//  public String toString() {
//    // Return concise name so output matches the example
//    return "Rectangle";
//  }
//}
//
//// Square extends GeometricObject and implements Colorable
//class Square extends GeometricObject implements Colorable {
//    private double side;
//
//    public Square() {
//        this.side = 0;
//    }
//
//    public Square(double side) {
//        this.side = side;
//    }
//
//    public double getSide() {
//        return side;
//    }
//
//    public void setSide(double side) {
//        this.side = side;
//    }
//
//    @Override
//    public double getArea() {
//        return side * side;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 4 * side;
//    }
//
//    @Override
//    public void howToColor() {
//        System.out.println("Square can be colored all four sides");
//    }
//
//    @Override
//    public String toString() {
//        return "Square";
//    }
//}
//
//// Test program
//public class Lab27T1 {
//    public static void main(String[] args) {
//        GeometricObject[] objects = {new Square(2), new Circle(5), new Square(5), new Rectangle(3, 4), new Square(4)};
//
//        for (int i = 0; i < objects.length; i++) {
//            if (objects[i] instanceof Colorable) {
//                ((Colorable) objects[i]).howToColor();
//            } else {
//                System.out.println(objects[i].toString() + " can not be colored");
//            }
//        }
//    }
//}
