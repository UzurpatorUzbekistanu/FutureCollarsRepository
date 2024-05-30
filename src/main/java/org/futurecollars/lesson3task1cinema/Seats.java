package org.futurecollars.lesson3task1cinema;

public class Seats {
    private int number;
    private int numberOfRow;
    private boolean isFree;

    Seats(int number, int numberOfRow, boolean isFree){
        this.number = number;
        this.numberOfRow = numberOfRow;
        this.isFree = isFree;
    }

    public int getNumber() {
        return number;
    }

    public int getNumberOfRow() {
        return numberOfRow;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    @Override
    public String toString() {
        return "Seats{" +
                "number=" + number +
                ", numberOfRow=" + numberOfRow +
                ", isFree=" + isFree +
                '}';
    }
}
