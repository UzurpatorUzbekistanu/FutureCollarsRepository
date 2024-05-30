package org.futurecollars.lesson3task3cinemaWorkers;

public class TicketSeller extends BaseEmployee{
    private static final int baseSalary = 3000;

    public TicketSeller(String name, String surname, int yearOfEmployment) {
        super(name, surname, yearOfEmployment);

    }

    @Override
    public int calculateMonthlySalary() {
        return baseSalary;
    }

    @Override
    public int getBaseSalary() {
        return baseSalary;
    }
}
