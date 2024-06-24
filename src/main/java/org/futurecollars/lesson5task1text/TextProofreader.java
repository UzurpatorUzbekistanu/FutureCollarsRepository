package org.futurecollars.lesson5task1text;

public class TextProofreader {

    boolean isHavingSigns(String text){
        return !text.isEmpty();
    }

    int textLength(String text){
        if(isHavingSigns(text)){
            return text.length();
        } else {
            throw new EmptyTextException("Tekst jest pusty. Proszę podać prawidłowy tekst.");
        }
    }

    boolean isPalindrome(String text) {
        if (isHavingSigns(text)) {
            text = text.toLowerCase();

            for (int i = 0; i < text.length() / 2; i++) {
                if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                    return false;
                }
            }
        } else {
            throw new EmptyTextException("Text is empty. Please enter valid text");
        }
        return true;
    }

}
