package org.futurecollars.lesson4task2geometricFigures;


class Rectangle extends Shape{
    private double width;
    private double height;

    Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }
    
    @Override
    double getArea() {
        return height * width;
    }

    @Override
    double getPerimeter() {
        return 2 * height + 2 * width;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }
}
