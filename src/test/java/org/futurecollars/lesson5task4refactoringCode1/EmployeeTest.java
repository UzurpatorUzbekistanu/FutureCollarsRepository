package org.futurecollars.lesson5task4refactoringCode1;

import java.math.BigDecimal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmployeeTest {

    @Test
    void shouldRetrieveEmployeeFullName() {
        //given
        Employee employee = new Employee("John", "Smith");
        //when
        String employeeFullName = employee.getEmployeeFullName();
        //then
        Assertions.assertNotNull(employeeFullName);
        Assertions.assertEquals("Employee name : John Smith", employeeFullName);
    }

    @Test
    void shouldRetrieveEmployeeFullNameWithAge() {
        //given
        Employee employee = new Employee("John", "Smith", 45);
        //when
        String employeeFullNameAndAge = employee.getEmployeeFullNameAndAge();
        //then
        Assertions.assertNotNull(employeeFullNameAndAge);
        Assertions.assertEquals("Employee details: John Smith is 45", employeeFullNameAndAge);
    }


    @Test
    void shouldRetrieveBaseSalary() {
        //given
        BigDecimal salary = new BigDecimal("3000");
        Employee employee = new Employee("John", "Smith", 45, salary);
        //when
        BigDecimal baseSalary = employee.getBaseSalary();
        //then
        Assertions.assertNotNull(baseSalary);
        Assertions.assertEquals(baseSalary, salary);
    }


    @Test
    void shouldRetrieveTotalSalary() {
        //given
        BigDecimal baseSalary = new BigDecimal("3000");
        BigDecimal bonus = new BigDecimal("500");
        Employee employee = new Employee("John", "Smith", 45, baseSalary, bonus);
        //when
        BigDecimal actualTotalSalary = employee.getTotalSalary();
        //then
        Assertions.assertNotNull(actualTotalSalary);
        Assertions.assertEquals(baseSalary.add(bonus), actualTotalSalary);
    }

    @Test
    void shouldRetrieveEmployeeBonus() {
        //given
        BigDecimal baseSalary = new BigDecimal("3000");
        BigDecimal bonus = new BigDecimal("500");
        Employee employee = new Employee("John", "Smith", 45, baseSalary, bonus);
        //when
        BigDecimal actualBonus = employee.getBonus();
        //then
        Assertions.assertNotNull(actualBonus);
        Assertions.assertEquals(bonus, actualBonus);
    }

}
