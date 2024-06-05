package org.futurecollars.lesson4task2geometricFigures;

class Square extends Rectangle{
    double side;


    Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    double getArea(){
        return Math.pow(side, 2);
    }

    @Override
    double getPerimeter(){
        return 4 * side;
    }

    double getSide() {
        return side;
    }

}
