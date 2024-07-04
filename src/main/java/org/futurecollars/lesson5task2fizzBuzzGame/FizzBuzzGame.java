package org.futurecollars.lesson5task2fizzBuzzGame;

public class FizzBuzzGame {

    public static void main(String[] args) {
        int maxNumber = 100;

        playFizzBuzz(maxNumber);

    }

    public static boolean isDivisibleBy3(int number) {
        return number % 3 == 0;
    }

    public static boolean isDivisibleBy5(int number) {
        return number % 5 == 0;
    }
    public static boolean isDivisibleBy3And5(int number) {
        return isDivisibleBy3(number) && isDivisibleBy5(number);
    }

    private static void playFizzBuzz(int maxNumber){
        for(int number = 1; number <= maxNumber; number++){
            if(isDivisibleBy3And5(number)){
                System.out.println("FizzBuzz");
            } else if (isDivisibleBy3(number)){
                System.out.println("Fizz");
            } else if (isDivisibleBy5(number)){
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
        }
    }
}
