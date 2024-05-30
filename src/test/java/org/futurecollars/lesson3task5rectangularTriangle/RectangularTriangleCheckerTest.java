package org.futurecollars.lesson3task5rectangularTriangle;

import static org.futurecollars.lesson3task5rectangularTriangle.RectangularTriangleChecker.isRectangularTriangle;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class RectangularTriangleCheckerTest {

    @Test
    public void shouldBeTrueWithRectangularTriangle(){
//        given
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;

//        when - with variable order
        boolean result1 = isRectangularTriangle(side1, side2, side3); // true
        boolean result2 = isRectangularTriangle(side3, side2, side1); // true
        boolean result3 = isRectangularTriangle(side1, side3, side2); // true

//        then
        Assertions.assertTrue(result1);
        Assertions.assertTrue(result2);
        Assertions.assertTrue(result3);

    }

    @Test
    public void shouldBeFalseWithEquilateralTriangle(){
//        given
        int side1 = 6;

//        when - with variable order
        boolean result1 = isRectangularTriangle(side1, side1, side1); // false


//        then
        Assertions.assertFalse(result1);
    }

    @Test
    public void shouldBeFalseWithIsoscelesTriangle(){

        //        given
        int side1 = 5;
        int side2 = 4;
        int side3 = 5;

//        when - with variable order
        boolean result1 = isRectangularTriangle(side1, side2, side3); // false
        boolean result2 = isRectangularTriangle(side3, side2, side1); // false
        boolean result3 = isRectangularTriangle(side1, side3, side2); // false

//        then
        Assertions.assertFalse(result1);
        Assertions.assertFalse(result2);
        Assertions.assertFalse(result3);

    }
}
