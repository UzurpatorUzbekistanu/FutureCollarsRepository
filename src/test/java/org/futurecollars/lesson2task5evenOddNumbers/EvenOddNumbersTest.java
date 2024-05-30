package org.futurecollars.lesson2task5evenOddNumbers;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class EvenOddNumbersTest {

    @Test
    public void shouldCheckIsEven (){
//        given
        int a = 199;
        int b = 100;

//        when
        boolean resultOdd = EvenOddNumbers.isEven(a);
        boolean resultEven = EvenOddNumbers.isEven(b);

//        then
        Assertions.assertFalse(resultOdd);
        Assertions.assertTrue(resultEven);
    }

    @Test
    public void shouldCheckisOdd(){
//        given
        int a = 10;
        int b = 19;

//        when
        boolean resultEven = EvenOddNumbers.isOdd(a);
        boolean resultOdd = EvenOddNumbers.isOdd(b);

//        then
        Assertions.assertFalse(resultEven);
        Assertions.assertTrue(resultOdd);
    }

}
