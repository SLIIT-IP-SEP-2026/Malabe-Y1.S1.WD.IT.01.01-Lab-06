import java.util.Scanner;

public class IT26101970Lab6Q1 {

    public static void main(String[] args) {

        // Declaring variables
        double number, square, squareRoot;

        // Creating a scanner input
        Scanner input = new Scanner(System.in);

        // Getting the input from the user
        System.out.print("Enter a number: ");
        number = input.nextDouble();

        // Calculating the square and square root
        square = number * number;
        squareRoot = Math.sqrt(number);

        // Displaying the output
        System.out.println();
        System.out.println("The square of " + number + " is: " + square);
        System.out.println("The square root " + number + " is: " + squareRoot);
    }
}
