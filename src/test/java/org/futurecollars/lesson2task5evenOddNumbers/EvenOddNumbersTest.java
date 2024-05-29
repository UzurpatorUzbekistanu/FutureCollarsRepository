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
}
