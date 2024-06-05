package org.futurecollars.lesson4task3areaAndPerimeter;

public class Square implements GeometricsMethods{

    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return Math.pow(side, 2);
    }

    @Override
    public double perimeter() {
        return side * 4;
    }
}
