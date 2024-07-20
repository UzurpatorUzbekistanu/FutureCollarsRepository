package org.futurecollars.lesson5task3boostedCalculator;

public class Calculator {

    public double calculate(Operation operation, double a, double b) {
        return operation.execute(a, b);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        double a = 10;
        double b = 5;

        System.out.println("Addition: " + calculator.calculate(new Addition(), a, b));
        System.out.println("Subtraction: " + calculator.calculate(new Subtraction(), a, b));
        System.out.println("Multiplication: " + calculator.calculate(new Multiplication(), a, b));
        System.out.println("Division: " + calculator.calculate(new Division(), a, b));
    }
}
