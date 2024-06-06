package org.futurecollars.lesson4task2geometricFigures;

public class Triangle extends Shape{
    private double side1;
    private double side2;
    private double baseOfTriangle;
    private double height;

    public Triangle(double side1, double side2, double baseOfTriangle, double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.baseOfTriangle = baseOfTriangle;
        this.height = height;
    }



    @Override
    double getArea() {
        return 0.5 * baseOfTriangle * height;
    }

    @Override
    double getPerimeter() {

        return side1 + side2 + baseOfTriangle;
    }
}
