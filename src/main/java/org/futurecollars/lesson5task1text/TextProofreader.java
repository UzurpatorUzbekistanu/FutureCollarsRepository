package org.futurecollars.lesson5task1text;

public class TextProofreader {

    boolean isHavingSigns(String text){
        return !text.isEmpty();
    }

    int textLength(String text){
        if(isHavingSigns(text)){
            return text.length();
        } else {
            throw new EmptyTextException("Text is empty. Please enter valid text.");
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

    void processText(String text) {
        if (isHavingSigns(text)) {
            System.out.println("Text contains characters.");
            System.out.println("Is the text a palindrome? " + isPalindrome(text));
            System.out.println("Text length: " + textLength(text));
        } else {
            throw new EmptyTextException("Text is empty. Please enter valid text.");
        }
    }


}
