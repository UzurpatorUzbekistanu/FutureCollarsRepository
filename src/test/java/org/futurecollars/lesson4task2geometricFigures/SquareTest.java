package org.futurecollars.lesson4task2geometricFigures;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SquareTest {

    @Test
    public void  shouldGiveArea(){
        //         given
        Square square = new Square(5.3);

//        when
        double result = square.getArea();

//        then
        Assertions.assertEquals(28.09, result);
    }

    @Test
    public void  shouldGivePerimeter(){
        //         given
        Square square = new Square(5.3);

//        when
        double result = square.getPerimeter();

//        then
        Assertions.assertEquals(21.2, result);
    }
}
