package org.futurecollars.lesson4task2geometricFigures;

class Circle extends Shape{

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }


    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    double getRadius() {
        return radius;
    }
}
