package org.futurecollars.lesson4task2geometricFigures;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class RectangleTest {

    @Test
    public void  shouldGiveArea(){

        //         given
        Rectangle rectangle = new Rectangle(5.3, 6.3);

//        when
        double result = rectangle.getArea();

//        then
        Assertions.assertEquals(33.390000000000001, result);
    }

    @Test
    public void  shouldGivePerimeter(){

        //         given
        Rectangle rectangle = new Rectangle(5.3, 6.3);

        //        when
        double result = rectangle.getArea();

//        then
        Assertions.assertEquals(33.39, result);
    }



}
