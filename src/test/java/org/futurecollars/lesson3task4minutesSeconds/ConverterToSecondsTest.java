package org.futurecollars.lesson3task4minutesSeconds;
import static org.futurecollars.lesson3task4minutesSeconds.ConverterToSeconds.convertToSeconds;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ConverterToSecondsTest {

        @Test
        public void shouldConvertToSeconds(){
//        given
            int minutes = 60;

//        when
            int resultSeconds = convertToSeconds(minutes);

//        then
            Assertions.assertEquals(3600,resultSeconds);
        }
    }

