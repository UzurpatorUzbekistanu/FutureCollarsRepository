package org.futurecollars.lesson4task2geometricFigures;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SquareTest {

    @Test

    public void shouldReturnArea(){
//        given
        Square square = new Square(3.0);

//        when
        double area = square.getArea();

//        then
        Assertions.assertEquals(9, area);
    }

    @Test
    public void shouldReturnPerimeter(){
//        given
        Square square = new Square(3.0);

//        when
        double perimeter = square.getPerimeter();

//        then
        Assertions.assertEquals(12, perimeter);

    }
}
