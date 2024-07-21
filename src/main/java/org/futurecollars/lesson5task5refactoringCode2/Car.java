package org.futurecollars.lesson5task5refactoringCode2;

public class Car implements Vehicle {
    private Engine engine;

    public Car() {
        this.engine = new Engine();
    }

    @Override
    public void start() {
        engine.start();
        System.out.println("Car engine started.");
    }

    @Override
    public void stop() {
        engine.stop();
        System.out.println("Car engine stopped.");
    }

    public boolean isEngineStarted() {
        return engine.isEngineStarted();
    }
}