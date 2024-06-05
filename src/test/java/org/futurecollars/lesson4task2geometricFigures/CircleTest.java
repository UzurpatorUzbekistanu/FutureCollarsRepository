package org.futurecollars.lesson4task2geometricFigures;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CircleTest {

    @Test
    public void shouldReturnArea(){
//        given
        Circle circle = new Circle(3.0);

//        when
        double area = circle.getArea();

//        then
        Assertions.assertEquals(28.274333882308138, area);
    }

    @Test
    public void shouldReturnPerimeter(){
//        given
        Circle circle = new Circle(3.0);

//        when
        double perimeter = circle.getPerimeter();

//        then
        Assertions.assertEquals(18.84955592153876, perimeter);
    }
}
