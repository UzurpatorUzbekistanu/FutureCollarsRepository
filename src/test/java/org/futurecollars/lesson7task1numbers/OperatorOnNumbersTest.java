package org.futurecollars.lesson7task1numbers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperatorOnNumbersTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10, 20, 100})
    @DisplayName("Test isDivisibleByTwo with even numbers")
    void testIsDivisibleByTwoWithEvenNumbers(int number) {
        assertTrue(OperatorOnNumbers.isDivisibleByTwo(number), number + " should be divisible by two");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9, 11, 21, 101})
    @DisplayName("Test isDivisibleByTwo with odd numbers")
    void testIsDivisibleByTwoWithOddNumbers(int number) {
        assertFalse(OperatorOnNumbers.isDivisibleByTwo(number), number + " should not be divisible by two");
    }

    @ParameterizedTest
    @CsvSource({
            "123, 6",
            "456, 15",
            "789, 24",
            "0, 0",
            "999, 27",
            "111, 3"
    })
    @DisplayName("Test sumOfDigitsOfNumber with various numbers")
    void testSumOfDigitsOfNumber(int number, int expectedSum) {
        assertEquals(expectedSum, OperatorOnNumbers.sumOfDigitsOfNumber(number),
                "Sum of digits of " + number + " should be " + expectedSum);
    }
}
