package org.futurecollars.lesson4task3areaAndPerimeter;

public class Rectangle implements GeometricsMethods{

    double sideFirst;
    double sideSecond;

    public Rectangle(double sideFirst, double sideSecond) {
        this.sideFirst = sideFirst;
        this.sideSecond = sideSecond;
    }

    @Override
    public double area() {
        return sideFirst * sideSecond;
    }

    @Override
    public double perimeter() {
        return sideSecond * 2 + sideFirst * 2;
    }
}
