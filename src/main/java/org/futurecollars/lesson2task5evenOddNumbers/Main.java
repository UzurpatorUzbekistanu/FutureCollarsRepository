package org.futurecollars.lesson2task5evenOddNumbers;
import static org.futurecollars.lesson2task5evenOddNumbers.EvenOddNumbers.isEven;

public class Main {
    public static void main(String[] args) {

        int number = 205;

        System.out.println("czy " + number + " jest parzysta?");
        System.out.println("odpowiedź: " + isEven(number));
    }
}
