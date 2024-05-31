package org.futurecollars.lesson4task1messageClass;

public class ConsoleMessage extends Message{


    @Override
    String getMessage() {
        return "This is class: " + ConsoleMessage.class.getName();
    }
}
