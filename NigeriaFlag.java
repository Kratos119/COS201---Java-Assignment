package Kratos;
public class NigeriaFlag {
    public static void main(String[] args) {
        int height = 9; // Number of rows for the flag
        int width = 15; // Number of columns for each color section

        for (int i = 0; i < height; i++) {
            // Print the green section
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }

            // Print the white section
            for (int j = 0; j < width; j++) {
                System.out.print("=");
            }

            // Print the second green section
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
