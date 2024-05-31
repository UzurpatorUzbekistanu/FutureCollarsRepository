package org.futurecollars.lesson2task4ageVeryfication;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AgeVeryficationTest {

    @Test
    public void shouldBeLowerAge(){
//        given
        int ageLower = 16;

//        when
        boolean testAgeLower = AgeVeryfication.verifyAge(ageLower);
//        then
        Assertions.assertFalse(testAgeLower);

    }
    @Test
    public void shouldBeAdultWith18Years(){
//        given
        int ageEqual = 18;

//        when
        boolean testAgeEqual = AgeVeryfication.verifyAge(ageEqual);

//        then
        Assertions.assertTrue(testAgeEqual);
    }

    @Test
    public void shouldBeAdult(){

//        given
        int ageHigher = 23;

//        when
        boolean testAgeHigher = AgeVeryfication.verifyAge(ageHigher);

//        then
        Assertions.assertTrue(testAgeHigher);

    }

}
