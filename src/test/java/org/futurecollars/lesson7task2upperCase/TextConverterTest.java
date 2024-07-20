package org.futurecollars.lesson7task2upperCase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TextConverterTest {

    @ParameterizedTest
    @ValueSource(strings = {"abc", "Test", "Hello World", "123", "aBcDeF"})
    @DisplayName("Test toUpperCase with different strings")
    void testToUpperCase(String input) {
        String expected = input.toUpperCase();
        String result = TextConverter.toUpperCase(input);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test toUpperCase with null input")
    void testToUpperCaseNull() {
        assertThrows(IllegalArgumentException.class, () -> TextConverter.toUpperCase(null));
    }

    @Test
    @DisplayName("Test toUpperCase with empty string")
    void testToUpperCaseEmpty() {
        String input = "";
        String expected = "";
        String result = TextConverter.toUpperCase(input);
        assertEquals(expected, result);
    }
}

