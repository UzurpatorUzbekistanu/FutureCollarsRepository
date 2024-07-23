package org.futurecollars.lesson7task7training;

public class TrainingEvaluation {

    public int evaluateDuration(int durationInMinutes) {
        if (durationInMinutes < 30) {
            return 1;
        } else if (durationInMinutes <= 60) {
            return 2;
        } else {
            return 3;
        }
    }

    public int evaluateCalories(int caloriesBurned) {
        if (caloriesBurned <= 300) {
            return 1;
        } else if (caloriesBurned < 400) {
            return 2;
        } else {
            return 3;
        }
    }

    public int evaluateHeartRate(int averageHeartRate) {
        if (averageHeartRate < 160) {
            return 3;
        } else if (averageHeartRate <= 175) {
            return 2;
        } else {
            return 1;
        }
    }

    public double calculateWeightedAverage(int durationScore, int caloriesScore, int heartRateScore) {
        return (durationScore * 1 + caloriesScore * 2 + heartRateScore * 3) / 6.0;
    }

    public String evaluateTraining(int durationInMinutes, int caloriesBurned, int averageHeartRate) {
        int durationScore = evaluateDuration(durationInMinutes);
        int caloriesScore = evaluateCalories(caloriesBurned);
        int heartRateScore = evaluateHeartRate(averageHeartRate);

        double weightedAverage = calculateWeightedAverage(durationScore, caloriesScore, heartRateScore);

        if (weightedAverage < 1.2) {
            return "niska";
        } else if (weightedAverage < 2) {
            return "dobra";
        } else if (weightedAverage < 3) {
            return "bardzo dobra";
        } else {
            return "doskonała";
        }
    }
}
