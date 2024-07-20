package org.futurecollars.lesson11task1numbersDividedBy3;


import java.util.stream.IntStream;

public class NumbersList {

    static void isDividedBy3inRange(int lowerRange, int upperRange){
        IntStream.range(lowerRange, upperRange)
                .filter(number -> number % 3 == 0)
                .forEach(number -> System.out.println(number));
    }
}
