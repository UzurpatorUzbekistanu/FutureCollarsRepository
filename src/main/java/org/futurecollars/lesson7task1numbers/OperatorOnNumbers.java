package org.futurecollars.lesson7task1numbers;

public class OperatorOnNumbers {


    public static boolean isDivisibleByTwo(int number) {
        return number % 2 == 0;
    }

    public static int sumOfDigitsOfNumber (int number){
        String numberAsText = String.valueOf(number);
        int sumOfDigitsOfNumber = 0;

        for(int digitIndex = 0; digitIndex < numberAsText.length(); digitIndex++ ){
            sumOfDigitsOfNumber += numberAsText.charAt(digitIndex) - '0';
        }
        return sumOfDigitsOfNumber;
    }

}
