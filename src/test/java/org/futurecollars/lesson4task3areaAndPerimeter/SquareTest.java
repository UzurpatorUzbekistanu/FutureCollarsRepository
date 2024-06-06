package org.futurecollars.lesson4task3areaAndPerimeter;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SquareTest {

    @Test
    public void shouldReturnArea(){
//        given
        Square square = new Square(3.0);

//        when
        double area = square.area();

//        then
        Assertions.assertEquals(9, area);
    }

    @Test
    public void shouldReturnPerimeter(){
//        given
        Square square = new Square(3.0);

//        when
        double perimeter = square.perimeter();

//        then
        Assertions.assertEquals(12, perimeter);
    }
}
