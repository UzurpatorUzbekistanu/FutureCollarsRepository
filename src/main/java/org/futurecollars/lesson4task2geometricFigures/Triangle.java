package org.futurecollars.lesson4task2geometricFigures;

public class Triangle extends Shape{
    double sideFirst;
    double sideSecond;
    double sideThird;

    public Triangle(double sideFirst, double sideSecond, double sideThird) {
        this.sideFirst = sideFirst;
        this.sideSecond = sideSecond;
        this.sideThird = sideThird;
    }

    @Override
    double getArea() {
        double halfPerimeter = getPerimeter()/2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideFirst) * (halfPerimeter - sideSecond) *
                (halfPerimeter - sideThird));
    }

    @Override
    double getPerimeter() {
        return sideFirst + sideSecond + sideThird;
    }
}
