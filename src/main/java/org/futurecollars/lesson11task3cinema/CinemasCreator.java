package org.futurecollars.lesson11task3cinema;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class CinemasCreator {

    public static void main(String[] args) {


        List<Cinemas> cinemasList = new ArrayList<>();
        cinemasList.add(new Cinemas("Warszawa", CinemaType._2D));
        cinemasList.add(new Cinemas("Kalisz", CinemaType._3D));
        cinemasList.add(new Cinemas("Wrocław", CinemaType._2D));
        cinemasList.add(new Cinemas("Gdańsk", CinemaType._4D));
        cinemasList.add(new Cinemas("Opole", CinemaType._4D));
        cinemasList.add(new Cinemas("Radom", CinemaType._2D));
        cinemasList.add(new Cinemas("Poznań", CinemaType._2D));
        cinemasList.add(new Cinemas("Szczecin", CinemaType._4D));
        cinemasList.add(new Cinemas("Rzeszów", CinemaType._3D));
        cinemasList.add(new Cinemas("Białystok", CinemaType._3D));


        System.out.println("Ilość sal kinowych w 2D: " + cinemasList.stream()
                .filter(cinemas -> cinemas.type.equals(CinemaType._2D))
                .count());

        System.out.println("Ilość sal kinowych w 3D: " + cinemasList.stream()
                .filter(cinemas -> cinemas.type.equals(CinemaType._3D))
                .count());

        System.out.println("Ilość sal kinowych w 4D: " + cinemasList.stream()
                .filter(cinemas -> cinemas.type.equals(CinemaType._4D))
                .count());

    }


}
