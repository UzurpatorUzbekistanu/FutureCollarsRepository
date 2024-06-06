package org.futurecollars.lesson3task3cinemaWorkers;

public abstract class BaseEmployee {
    private String name;
    private String surname;
    private int yearOfEmployment;
    private int baseSalary = 3000;

    public BaseEmployee(String name, String surname, int yearOfEmployment) {
        this.name = name;
        this.surname = surname;
        this.yearOfEmployment = yearOfEmployment;
    }

    public abstract int calculateMonthlySalary();

    public abstract int getBaseSalary();

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    public int getSeniority(){
        return 2024 - yearOfEmployment;
    }
}


