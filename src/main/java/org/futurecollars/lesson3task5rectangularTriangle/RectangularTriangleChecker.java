package org.futurecollars.lesson3task5rectangularTriangle;

public class RectangularTriangleChecker {

    public static boolean isRectangularTriangle (int side1, int side2, int side3){

        int hypotenuse, a, b;
        if (side1 > side2 && side1 > side3){
            hypotenuse = side1;
            a = side2;
            b = side3;
        } else if (side2 > side1 && side2 > side3){
            hypotenuse = side2;
            a = side1;
            b = side3;
        } else if (side3 > side1 && side3 > side2){
            hypotenuse = side3;
            a = side1;
            b = side2;
        } else return false;
        return (Math.pow(hypotenuse,2) == Math.pow(a, 2) + Math.pow(b, 2));
    }
}
