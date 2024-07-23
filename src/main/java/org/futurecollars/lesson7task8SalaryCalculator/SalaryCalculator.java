package org.futurecollars.lesson7task8SalaryCalculator;

public class SalaryCalculator {
    private final BaseSalaryService baseSalaryService;
    private final SaturdayBonusService saturdayBonusService;

    public SalaryCalculator(BaseSalaryService baseSalaryService, SaturdayBonusService saturdayBonusService) {
        this.baseSalaryService = baseSalaryService;
        this.saturdayBonusService = saturdayBonusService;
    }

    public double calculateSalary(double oneTimeBonus, int numberOfSaturdays) {
        double baseSalary = baseSalaryService.getBaseSalary();
        double saturdayBonus = saturdayBonusService.getSaturdayBonus();
        return baseSalary + oneTimeBonus + (saturdayBonus * numberOfSaturdays);
    }
}
