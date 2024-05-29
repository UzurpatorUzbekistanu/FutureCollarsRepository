package org.futurecollars.lesson2task3calculator;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class CalculatorTest {

    @Test
    public void shouldAddTwoValues(){
//        given
        int a = 1;
        int b = 1;

//        when
        int result = Calculator.sum(a, b);

//        then
        Assertions.assertEquals(2, result);

    }

    @Test
    public void shouldSubstractTwoValues(){
//        given
        int a = 3;
        int b = 1;

//        when
        int result = Calculator.substract(a, b);

//        then
        Assertions.assertEquals(2, result);
    }

    @Test
    public void shouldMultiplyTwoValues(){
//        given
        int a = 2;
        int b = 2;

//        when
        int result = Calculator.multiply(a, b);

//        then
        Assertions.assertEquals(4, result);
    }

    @Test
    public void shouldDivideTwoValues(){
//        given
        int a = 6;
        int b = 3;

//        when
        int result = Calculator.divide(a,b);

//        then
        Assertions.assertEquals(2,result);
    }
}
