package org.futurecollars.lesson10task5passwordValidator;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static void main(String[] args) {

        String examplePassword = "Int224yga123#";

        String dateYear = String.valueOf(LocalDate.now().getYear());

        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?!.*" + dateYear + ").{7,}$");
        Matcher matcher = pattern.matcher(examplePassword);

        System.out.println(matcher.matches());
    }
}
