package org.futurecollars.lesson2task4ageVeryfication;
import static org.futurecollars.lesson2task4ageVeryfication.AgeVeryfication.verifyAge;

public class Main {
    public static void main(String[] args) {
        int age = 15;

        System.out.println("Czy pełnoletni?");
        System.out.println("Wiek: " + age);
        System.out.println("odpowiedź: " + verifyAge(age));
    }
}
