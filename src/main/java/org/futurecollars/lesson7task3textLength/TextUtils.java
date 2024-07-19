package org.futurecollars.lesson7task3textLength;

public class TextUtils {
    public static int getLength(String text) {
        if (text == null) {
            return 0;
        }
        return text.length();
    }
}