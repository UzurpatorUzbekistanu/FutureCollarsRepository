package org.futurecollars.lesson7task3textLength;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextUtilsTest {

    @ParameterizedTest
    @MethodSource("provideStringsForGetLength")
    @DisplayName("Test getLength with different strings")
    void testGetLength(String input, int expectedLength) {
        assertEquals(expectedLength, TextUtils.getLength(input));
    }

    private static Stream<Arguments> provideStringsForGetLength() {
        return Stream.of(
                Arguments.of("hello", 5),
                Arguments.of("", 0),
                Arguments.of(" ", 1),
                Arguments.of("razDwa", 6),
                Arguments.of(null, 0),
                Arguments.of("1234567890", 10)
        );
    }
}