package Kratos;

public class AmericanFlag {

	public class AmericaFlag {
	    public static void main(String[] args) {
	        int rows = 15; // Total rows for the flag
	        int columns = 30; // Total columns for the flag

	        for (int i = 0; i < rows; i++) {
	            // Print the stars and stripes section
	            if (i < 9) { // Top section with stars
	                for (int j = 0; j < columns; j++) {
	                    if (j < 12 && i % 2 == 0) { // Star section
	                        System.out.print("*");
	                    } else { // Stripe section
	                        System.out.print("=");
	                    }
	                }
	            } else { // Bottom stripes section
	                for (int j = 0; j < columns; j++) {
	                    System.out.print("=");
	                }
	            }
	            // Move to the next line
	            System.out.println();
	        }
	    }
	}
}