package org.futurecollars.lesson2task6daysOfWeek;

public class DaysOfWeek {
    public static String whatDayIsIt(int numberOfDay){
        switch (numberOfDay){
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
            case 7:
                return "Weekend";
            default:
                return "There is no such a day!";
        }
    }
}
