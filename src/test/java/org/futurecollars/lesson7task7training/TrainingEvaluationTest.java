package org.futurecollars.lesson7task7training;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainingEvaluationTest {

    private final TrainingEvaluation trainingEvaluation = new TrainingEvaluation();

    @ParameterizedTest
    @MethodSource("provideParametersForEvaluation")
    void shouldEvaluateTraining(int durationInMinutes, int caloriesBurned, int averageHeartRate, String expectedEvaluation) {
        String result = trainingEvaluation.evaluateTraining(durationInMinutes, caloriesBurned, averageHeartRate);
        assertEquals(expectedEvaluation, result);
    }

    private static Stream<Arguments> provideParametersForEvaluation() {
        return Stream.of(
                Arguments.of(25, 250, 150, "bardzo dobra"),
                Arguments.of(30, 350, 165, "bardzo dobra"),
                Arguments.of(70, 450, 160, "bardzo dobra"),
                Arguments.of(61, 401, 155, "doskonała"),
                Arguments.of(20, 200, 170, "dobra"),
                Arguments.of(45, 350, 175, "bardzo dobra"),
                Arguments.of(30, 290, 176, "niska"),
                Arguments.of(65, 420, 158, "doskonała"),
                Arguments.of(30, 400, 175, "bardzo dobra"),
                Arguments.of(90, 500, 140, "doskonała")
        );
    }
}

