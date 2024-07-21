package org.futurecollars.lesson5task5refactoringCode2;

public class Engine {
    private boolean engineStarted;

    public void start() {
        if (!engineStarted) {
            engineStarted = true;
        }
    }

    public void stop() {
        if (engineStarted) {
            engineStarted = false;
        }
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }

    public void setEngineStarted(boolean engineStarted) {
        this.engineStarted = engineStarted;
    }
}

