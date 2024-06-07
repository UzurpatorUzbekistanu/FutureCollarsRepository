package org.futurecollars.lesson4task2geometricFigures;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TriangleTest {

    @Test
    public void shouldReturnArea(){
//        given
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

//        when
        double area = triangle.getArea();

//        then
        Assertions.assertEquals(6, area);
    }

    @Test
    public void shouldReturnPerimeter(){
//        given
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

//        when
        double perimeter = triangle.getPerimeter();

//        then
        Assertions.assertEquals(12, perimeter);
    }
}
