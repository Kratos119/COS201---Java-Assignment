package Kratos;

import java.util.Scanner;

public class UserInput2DArray {
    public static void main(String[] args) {
        // Declare a 2D array of size 10 by 10
        int[][] numbers = new int[4][4];

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Loop to accept input from the user and assign to the 2D array
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print("Enter a number for index [" + i + "][" + j + "]: ");
                numbers[i][j] = scanner.nextInt();
            }
        }

        // Using a for-each loop to print out the input entered by the user
        System.out.println("You entered:");
        for (int[] row : numbers) {
            for (int number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
