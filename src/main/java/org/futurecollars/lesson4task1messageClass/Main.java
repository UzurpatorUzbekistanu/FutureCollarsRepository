package org.futurecollars.lesson4task1messageClass;

public class Main {
    public static void main(String[] args) {

        ConsoleMessage consoleMessage = new ConsoleMessage();
        WindowMessage windowMessage = new WindowMessage();

        System.out.println(consoleMessage.getMessage());
        System.out.println(windowMessage.getMessage());
    }
}
