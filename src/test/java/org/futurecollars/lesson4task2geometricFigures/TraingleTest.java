package org.futurecollars.lesson4task2geometricFigures;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TraingleTest {

    @Test
    public void  shouldGiveArea(){

        //         given
        Triangle triangle = new Triangle(5.0, 6.0, 7.0 );

//        when
        double result = triangle.getArea();

//        then
        Assertions.assertEquals(17.5, result);
    }

    @Test
    public void  shouldGivePerimeter(){

        //         given
        Triangle triangle = new Triangle(5.0, 6.0, 7.0 );

//        when
        double result = triangle.getPerimeter();

//        then
        Assertions.assertEquals(18.0, result);
    }
}
