package org.futurecollars.lesson3task1cinema;

public class Main {
    public static void main(String[] args) {

//        3 examples of seats
        Seats seat1 = new Seats(1, 1, true);
        Seats seat2 = new Seats(1, 2, true);
        Seats seat3 = new Seats(1, 3, true);

//        take a seat
        seat1.setFree(false);
        seat2.setFree(false);

//        display
        System.out.println(seat1);
        System.out.println(seat2);
        System.out.println(seat3);
    }
}
