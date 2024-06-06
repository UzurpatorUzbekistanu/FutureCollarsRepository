package org.futurecollars.lesson3task3cinemaWorkers;

public class TicketSeller extends BaseEmployee{
    private int baseSalary = 3000;

    public TicketSeller(String name, String surname, int yearOfEmployment) {
        super(name, surname, yearOfEmployment);

    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
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
