import java.util.Scanner;

public class IT26102630Lab6Q1 {
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		// Read the number from the keyboard
        System.out.print("Enter a number: ");
        double number = input.nextDouble();
		
		// Validate the input
		if (number <= 0) {
			System.out.println("Error: The number must be greater than zero");
		}
		else{
		// Calculate the square and square root 
		double square = number * number;
		double squareRoot = Math.sqrt(number);
		
		// Display the results
		System.out.println();
		System.out.println("The square of " + number + " is: " + square);
		System.out.println("The square root of " + number + " is: " + squareRoot);
	    }
	}
} 