package org.futurecollars.lesson3task3cinemaWorkers;

public class Manager extends BaseEmployee{
    private static final int baseSalary = 5000;
    private static int monthlyBonus = 500;

    public Manager(String name, String surname, int yearOfEmployment) {
        super(name, surname, yearOfEmployment);
    }

    @Override
    public int calculateMonthlySalary() {
        return baseSalary + monthlyBonus;
    }

    public int getBaseSalary(){
        return baseSalary;
    }
    public static int getMonthlyBonus() {
        return monthlyBonus;
    }
    public static void setMonthlyBonus(int valueOfBonus){
        monthlyBonus = valueOfBonus;
    }


}
