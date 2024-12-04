package org.futurecollars.lesson10task2PESELvalidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeselValidator {


    boolean isPeselValidate(String pesel){
        Pattern pattern = Pattern.compile("\\d{11}");
        Matcher matcher = pattern.matcher(pesel);
        return matcher.matches();
    }
}
