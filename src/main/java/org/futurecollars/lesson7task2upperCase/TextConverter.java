package org.futurecollars.lesson7task2upperCase;

public class TextConverter {

    public static String toUpperCase(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Input text cannot be null");
        }
        return text.toUpperCase();
    }
}