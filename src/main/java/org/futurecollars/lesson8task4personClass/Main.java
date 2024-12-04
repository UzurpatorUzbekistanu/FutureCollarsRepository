package org.futurecollars.lesson8task4personClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", "Doe", 1985, 180.5, 75.0));
        people.add(new Person("Jane", "Smith", 1992, 165.0, 60.0));
        people.add(new Person("Alice", "Johnson", 2000, 170.0, 55.0));
        people.add(new Person("Bob", "Brown", 1975, 175.0, 85.0));


        Collections.sort(people);
        System.out.println("Sorted by age (youngest to oldest):");
        printPeople(people);


        Collections.sort(people, PersonComparators.heightComparator());
        System.out.println("Sorted by height (shortest to tallest):");
        printPeople(people);


        Collections.sort(people, PersonComparators.weightComparator());
        System.out.println("Sorted by weight (heaviest to lightest):");
        printPeople(people);
    }


    private static void printPeople(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

