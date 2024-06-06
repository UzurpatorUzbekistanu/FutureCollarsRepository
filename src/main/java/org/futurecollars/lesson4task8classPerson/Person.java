package org.futurecollars.lesson4task8classPerson;

import java.util.Objects;

public class Person {
    String name;
    String Surname;
    double height;
    double weight;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Double.compare(person.height, height) == 0 && Double.compare(person.weight, weight) == 0 && name.equals(person.name) && Surname.equals(person.Surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Surname, height, weight);
    }
}
