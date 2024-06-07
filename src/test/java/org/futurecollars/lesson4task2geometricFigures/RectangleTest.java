package org.futurecollars.lesson4task2geometricFigures;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class RectangleTest {


    public void shouldReturnArea(){
//        given
        Rectangle rectangle = new Rectangle(3.0, 4.0);

//        when
        double area = rectangle.getArea();

//        then
        Assertions.assertEquals(12, area);
    }

    @Test
    public void shouldReturnPerimeter(){
//        given
        Rectangle rectangle = new Rectangle(3.0, 4.0);

//        when
        double perimeter = rectangle.getPerimeter();

//        then
        Assertions.assertEquals(14, perimeter);
    }

}
