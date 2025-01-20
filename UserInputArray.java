package Kratos;

import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        // Declare an array of length 10
        int[] numbers = new int[10];

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Loop to accept input from the user and assign to the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number for index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Using a for-each loop to print out the input entered by the user
        System.out.println("You entered:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Close the scanner
        scanner.close();
    }
}
