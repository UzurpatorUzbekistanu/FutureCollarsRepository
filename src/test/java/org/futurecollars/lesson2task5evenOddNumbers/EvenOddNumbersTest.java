package org.futurecollars.lesson2task5evenOddNumbers;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class EvenOddNumbersTest {

    @Test
    public void shouldReturnFalseWithMethodIsEven (){
//        given
        int number = 199;

//        when
        boolean result = EvenOddNumbers.isEven(number);

//        then
        Assertions.assertFalse(result);
    }
    @Test
    public void shouldReturnTrueWithMethodIsEven () {
//        given
        int number = 200;
//        when
        boolean result = EvenOddNumbers.isEven(number);

//        then
        Assertions.assertTrue(result);

    }

    @Test
    public void shouldReturnTrueWithMethodIsOdd(){
//        given
        int number = 19;

//        when
        boolean result = EvenOddNumbers.isOdd(number);

//        then

        Assertions.assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWithMethodIsOdd(){
//        given
        int number = 22;

//        when
        boolean result = EvenOddNumbers.isOdd(number);

//        then
        Assertions.assertFalse(result);
    }

}
