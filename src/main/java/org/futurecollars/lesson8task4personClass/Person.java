package org.futurecollars.lesson8task4personClass;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int birthYear;
    private double height;
    private double weight;

    public Person(String firstName, String lastName, int birthYear, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
    }

    // Gettery
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(other.birthYear, this.birthYear);
    }


    @Override
    public String toString() {
        return String.format("%s %s, Year of Birth: %d, Height: %.2f, Weight: %.2f",
                firstName, lastName, birthYear, height, weight);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return birthYear == person.birthYear &&
                Double.compare(person.height, height) == 0 &&
                Double.compare(person.weight, weight) == 0 &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthYear, height, weight);
    }
}

