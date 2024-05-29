package org.futurecollars.lesson3task2film;

public class Main {
    public static void main(String[] args) {

        Films film1 = new Films("Brzydki", "Jan Nowak", 120, 1995);
        Films film2 = new Films("Ładny", "Stefan Kowalski", 125, 1992);

        System.out.println(film1);
        System.out.println(film2);
    }
}
