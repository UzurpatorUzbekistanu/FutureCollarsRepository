package org.futurecollars.lesson4task2geometricFigures;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CircleTest {

    @Test
    public void shouldGiveArea(){
//         given
        Circle circle = new Circle(5.2);

//        when
        double result = circle.getArea();

//        then
        Assertions.assertEquals(84.94866535306801, result);
    }

    @Test
    public void shouldGivePerimeter(){
//         given
        Circle circle = new Circle(5.2);

//        when
        double result = circle.getPerimeter();

//        then
        Assertions.assertEquals(32.67256359733385, result);
    }
}
