package org.futurecollars.lesson8task4personClass;

import java.util.Comparator;

public class PersonComparators {

    public static Comparator<Person> heightComparator() {
        return Comparator.comparingDouble(Person::getHeight);
    }

    public static Comparator<Person> weightComparator() {
        return Comparator.comparingDouble(Person::getWeight).reversed();
    }
}

