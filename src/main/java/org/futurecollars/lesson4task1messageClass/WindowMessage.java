package org.futurecollars.lesson4task1messageClass;

public class WindowMessage extends Message{


    @Override
    String getMessage() {
        return "This is class: " + WindowMessage.class.getName();
    }
}
