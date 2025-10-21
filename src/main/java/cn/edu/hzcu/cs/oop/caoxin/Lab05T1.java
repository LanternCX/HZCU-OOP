package cn.edu.hzcu.cs.oop.caoxin;

import java.util.ArrayList;
import java.util.Arrays;

class Rectangle{
    /**
     * @brief 宽
     */
    double width = 1;
    /**
     * @brief 高
     */
    double height = 1;

    /**
     * @brief 默认构造方法
     */
    Rectangle() {
    }

    /**
     * @brief 构造指定宽高的长方形
     * @param newWidth 宽
     * @param newHeight 高
     */
    Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    /**
     * @brief 获取长方形面积
     * @return 长方形面积
     */
    double getArea() {
        return width * height;
    }

    /**
     * @brief 获取长方形周长
     * @return 获取长方形周长
     */
    double getPerimeter() {
        return (width + height) * 2;
    }
}

public class Lab05T1 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        ArrayList<Rectangle> rectangleList = new ArrayList<>(Arrays.asList(rectangle1, rectangle2));
        for (Rectangle rectangle : rectangleList) {
            System.out.printf("The area of retangle with width %.2f and height %.2f is %.2f\n", rectangle.width, rectangle.height, rectangle.getArea());
            System.out.printf("The perimeter of a retangle is %.2f\n", rectangle.getPerimeter());
        }
    }
}