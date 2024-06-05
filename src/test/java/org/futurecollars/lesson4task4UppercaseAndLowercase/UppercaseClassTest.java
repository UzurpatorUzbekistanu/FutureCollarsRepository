package org.futurecollars.lesson4task4UppercaseAndLowercase;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UppercaseClassTest {

    @Test
    public void shouldReturnUppercase(){
//        given
        String text = "Lorem ipsum";
        UppercaseClass uppercaseClass = new UppercaseClass();

//        when
        String textUppercase = uppercaseClass.formatText(text);

//        then
        Assertions.assertEquals("LOREM IPSUM", textUppercase);
    }
}
