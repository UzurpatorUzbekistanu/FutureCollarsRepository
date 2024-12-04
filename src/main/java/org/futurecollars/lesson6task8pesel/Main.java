package org.futurecollars.lesson6task8pesel;

public class Main {
    public static void main(String[] args) {
        PeselValidator peselValidator = new PeselValidator();
        String name = null;
        System.out.println(peselValidator.validatePesel(name));
    }
}
