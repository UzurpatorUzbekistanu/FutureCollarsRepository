package org.futurecollars.lesson3task2film;

public class Films {

    private String title;
    private String director;
    private int duration;
    private int yearOfProduction;

    public Films(String title, String director, int duration, int yearOfProduction) {
        this.title = title;
        this.director = director;
        this.duration = duration;
        this.yearOfProduction = yearOfProduction;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return "Films{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", duration=" + duration +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
