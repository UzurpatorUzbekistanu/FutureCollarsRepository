package org.futurecollars.lesson6task8pesel;

public class IllegalLengthException extends RuntimeException{
    public IllegalLengthException(String message) {
        super(message);
    }
}
