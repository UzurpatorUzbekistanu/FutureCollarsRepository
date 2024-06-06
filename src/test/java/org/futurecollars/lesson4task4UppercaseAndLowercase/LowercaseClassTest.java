package org.futurecollars.lesson4task4UppercaseAndLowercase;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class LowercaseClassTest {

    @Test
    public void shouldReturnLowercase(){
//        given
        String text = "Lorem ipsum";
        LowercaseClass lowercaseClass = new LowercaseClass();

//        when
        String textLowercase = lowercaseClass.formatText(text);

//        then
        Assertions.assertEquals("lorem ipsum", textLowercase);
    }
}
