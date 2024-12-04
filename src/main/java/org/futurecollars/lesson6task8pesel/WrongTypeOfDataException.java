package org.futurecollars.lesson6task8pesel;

public class WrongTypeOfDataException extends RuntimeException{
    public WrongTypeOfDataException(String message) {
        super(message);
    }
}
