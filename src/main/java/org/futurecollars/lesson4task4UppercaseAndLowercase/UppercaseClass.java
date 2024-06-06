package org.futurecollars.lesson4task4UppercaseAndLowercase;

public class UppercaseClass implements TextFormatter{


    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
