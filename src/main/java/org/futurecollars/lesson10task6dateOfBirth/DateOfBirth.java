package org.futurecollars.lesson10task6dateOfBirth;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.DayOfWeek;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class DateOfBirth {
    public static void main(String[] args) {
        String birthDateStr = "1992-03-21";

        LocalDate birthDate = LocalDate.parse(birthDateStr);

        int age = calculateAge(birthDate);

        DayOfWeek dayOfWeek = birthDate.getDayOfWeek();

        int weekOfYear = getWeekOfYear(birthDate);

        System.out.println("Wiek: " + age + " lat");
        System.out.println("Dzień tygodnia: " + dayOfWeek);
        System.out.println("Tydzień roku: " + weekOfYear);
    }

    private static int calculateAge(LocalDate birthDate) {
        LocalDate now = LocalDate.now();
        return (int) ChronoUnit.YEARS.between(birthDate, now);
    }

    private static int getWeekOfYear(LocalDate date) {
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        return date.get(weekFields.weekOfYear());
    }
}


