package org.futurecollars.lesson4task7namesOfDaysOfWeek;

class DaysOfWeek {

    String getNameOfDay(DaysOfWeekEnum day) {
        switch (day) {
            case MONDAY -> {
                return "Monday";
            }
            case TUESDAY -> {
                return "Tuesday";
            }
            case WEDNESDAY -> {
                return "Wednesday";
            }
            case THURSDAY -> {
                return "Thursday";
            }
            case FRIDAY -> {
                return "Friday";
            }
            case SATURDAY -> {
                return "Saturday";
            }
            case SUNDAY -> {
                return "Sunday";
            }
        }
        return null;
    }
}



