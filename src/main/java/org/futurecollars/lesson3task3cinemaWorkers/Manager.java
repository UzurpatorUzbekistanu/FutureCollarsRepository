package org.futurecollars.lesson3task3cinemaWorkers;

public class Manager extends BaseEmployee{
    private int baseSalary = 5000;
    private int monthlyBonus = 500;

    public Manager(String name, String surname, int yearOfEmployment) {
        super(name, surname, yearOfEmployment);
    }

    @Override
    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public int calculateMonthlySalary() {
        return baseSalary + monthlyBonus;
    }

    public int getBaseSalary(){
        return baseSalary;
    }
    public int getMonthlyBonus() {
        return this.monthlyBonus;
    }
    public void setMonthlyBonus(int valueOfBonus){
        this.monthlyBonus = valueOfBonus;
    }


}
