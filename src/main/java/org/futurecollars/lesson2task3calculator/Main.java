package org.futurecollars.lesson2task3calculator;

public class Main {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;

//        add
        int resultAdd = Calculator.sum(a, b);
//        substract
        int resultSubstract = Calculator.substract(a, b);
//        multiply
        int resultMultiply = Calculator.multiply(a, b);
//        divide
        int resultDivide = Calculator.divide(a, b);

//        display

        System.out.println("Values: " + a + ", " + b);
        System.out.println("Sum: " + resultAdd);
        System.out.println("Subtract: " + resultSubstract);
        System.out.println("Multiply: " + resultMultiply);
        System.out.println("Divide: " + resultDivide);
    }
}
