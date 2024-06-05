package org.futurecollars.lesson4task2geometricFigures;

public class Rectangle extends Shape {

    double sideFirst, sideSecond;

    Rectangle(double sideFirst, double sideSecond){
        this.sideFirst = sideFirst;
        this.sideSecond = sideSecond;
    }

    @Override
    double getArea() {
        return sideFirst * sideSecond;
    }

    @Override
    double getPerimeter() {
        return sideFirst * 2 + sideSecond * 2;
    }
}
