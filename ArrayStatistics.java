package Kratos;

import java.util.Arrays;

public class ArrayStatistics {
    public static void main(String[] args) {
        // Array of numbers
        int[] numbers = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};

        // Calculate the mean
        double mean = calculateMean(numbers);
        System.out.println("Mean: " + mean);

        // Calculate the median
        double median = calculateMedian(numbers);
        System.out.println("Median: " + median);

        // Calculate the standard deviation
        double standardDeviation = calculateStandardDeviation(numbers, mean);
        System.out.println("Standard Deviation: " + standardDeviation);
    }

    // Method to calculate the mean
    public static double calculateMean(int[] numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    // Method to calculate the median
    public static double calculateMedian(int[] numbers) {
        Arrays.sort(numbers);
        int length = numbers.length;
        if (length % 2 == 0) {
            return (numbers[length / 2 - 1] + numbers[length / 2]) / 2.0;
        } else {
            return numbers[length / 2];
        }
    }

    // Method to calculate the standard deviation
    public static double calculateStandardDeviation(int[] numbers, double mean) {
        double sumOfSquaredDifferences = 0;
        for (int number : numbers) {
            sumOfSquaredDifferences += Math.pow(number - mean, 2);
        }
        return Math.sqrt(sumOfSquaredDifferences / numbers.length);
    }
}

