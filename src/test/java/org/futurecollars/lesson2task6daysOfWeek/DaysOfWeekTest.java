package org.futurecollars.lesson2task6daysOfWeek;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DaysOfWeekTest {

    @Test
    public void shouldReturnMondayForDay1 (){
        assertEquals("Monday", DaysOfWeek.whatDayIsIt(1));
    }
    @Test
    public void shouldReturnTuesdayForDay2 (){
        assertEquals("Tuesday", DaysOfWeek.whatDayIsIt(2));
    }
    @Test
    public void shouldReturnWednesdayForDay3 (){
        assertEquals("Wednesday", DaysOfWeek.whatDayIsIt(3));
    }
    @Test
    public void shouldReturnThursdayForDay4(){
        assertEquals("Thursday", DaysOfWeek.whatDayIsIt(4));
    }
    @Test
    public void shouldReturnFridayForDay5 (){
        assertEquals("Friday", DaysOfWeek.whatDayIsIt(5));
    }
    @Test
    public void shouldReturnSaturdayForDay6 (){
        assertEquals("Weekend", DaysOfWeek.whatDayIsIt(6));
    }
    @Test
    public void shouldReturnSundayForDay7 (){
        assertEquals("Weekend", DaysOfWeek.whatDayIsIt(7));
    }
    @Test
    public void shouldReturnInvalidDayForInvalidInput (){
        assertEquals("There is no such a day!", DaysOfWeek.whatDayIsIt(9));
    }
}
