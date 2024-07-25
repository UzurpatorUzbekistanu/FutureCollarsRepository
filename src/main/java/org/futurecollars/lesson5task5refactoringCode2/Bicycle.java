package org.futurecollars.lesson5task5refactoringCode2;

public class Bicycle implements Vehicle {

    @Override
    public void start() {
        System.out.println("Starting to pedal the bicycle.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the bicycle.");
    }
}
