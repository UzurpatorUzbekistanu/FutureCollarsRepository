package org.futurecollars.lesson10task3URLvalidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLvalidator {

    boolean isURLvalidate(String url){
        Pattern pattern = Pattern.compile("^(https?://)(www\\.)?[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }
}
