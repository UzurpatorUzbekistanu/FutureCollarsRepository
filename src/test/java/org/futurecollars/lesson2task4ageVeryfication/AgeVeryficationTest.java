package org.futurecollars.lesson2task4ageVeryfication;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AgeVeryficationTest {

    @Test
    public void shouldVerifyAge(){
//        given
        int ageLower = 16;
        int ageEqual = 18;
        int ageHigher = 23;

//        when
        boolean testAgeLower = AgeVeryfication.verifyAge(ageLower);
        boolean testAgeEqual = AgeVeryfication.verifyAge(ageEqual);
        boolean testAgeHigher = AgeVeryfication.verifyAge(ageHigher);

//        then
        Assertions.assertFalse(testAgeLower);
        Assertions.assertTrue(testAgeEqual);
        Assertions.assertTrue(testAgeHigher);


    }
}
