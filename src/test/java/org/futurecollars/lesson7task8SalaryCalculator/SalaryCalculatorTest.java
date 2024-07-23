package org.futurecollars.lesson7task8SalaryCalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class SalaryCalculatorTest {

    private BaseSalaryService baseSalaryService;
    private SaturdayBonusService saturdayBonusService;
    private SalaryCalculator salaryCalculator;

    @BeforeEach
    public void setUp() {
        baseSalaryService = Mockito.mock(BaseSalaryService.class);
        saturdayBonusService = Mockito.mock(SaturdayBonusService.class);
        salaryCalculator = new SalaryCalculator(baseSalaryService, saturdayBonusService);
    }

    @Test
    public void shouldCalculateSalaryCorrectly() {
        // Arrange
        double baseSalary = 3000.0;
        double oneTimeBonus = 500.0;
        double saturdayBonus = 100.0;
        int numberOfSaturdays = 3;

        when(baseSalaryService.getBaseSalary()).thenReturn(baseSalary);
        when(saturdayBonusService.getSaturdayBonus()).thenReturn(saturdayBonus);

        // Act
        double calculatedSalary = salaryCalculator.calculateSalary(oneTimeBonus, numberOfSaturdays);

        // Assert
        double expectedSalary = baseSalary + oneTimeBonus + (saturdayBonus * numberOfSaturdays);
        assertEquals(expectedSalary, calculatedSalary);
    }
}

