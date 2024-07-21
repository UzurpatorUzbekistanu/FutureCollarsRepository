package org.futurecollars.lesson6task7root;

public class SquareRootCalculator {

    public double calculate(double number){
        if(number < 0){
            throw new IllegalArgumentException("Number must be non-negative");
        }
        return Math.sqrt(number);
    }
}
