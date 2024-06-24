package org.futurecollars.lesson5task3boostedCalculator;

public class Calculator {

        public static double add(double a, double b) {
            return a + b;
        }

        public static double subtract(double a, double b) {
            return a - b;
        }

        public static double multiply(double a, double b) {
            return a * b;
        }

        public static double divide(double a, double b) {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not justified.");
            }
            return a / b;
        }

    }
