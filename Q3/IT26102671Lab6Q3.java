import java.util.Scanner;

public class IT26102671Lab6Q3 {

    public static void main(String[] args) {

    // Declaring the variables
    int number;
    double meanOfSquares, rms;

    // Initializing the variables
    double sumOfSquares = 0;
    int count = 0;

    // Creating new scanner input
    Scanner input = new Scanner (System.in);

    // Getting input from the users
    System.out.println("Enter the positive integers (terminate with -99)");

    // Calculating Root Mean Square value
    while(true) {

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (number == -99){
            break;
        }

        if (number > 0){
            // Updating the sum of squares and count
            sumOfSquares += Math.pow(number, 2);

            count++;
        } else {
            // Notifying the users
            System.out.println("Invalid input. Please enter a positive integer or -99");
        }
    }

    // Checking if any valid numbers are entered
    if (count > 0){

        // Calculating the rms
        meanOfSquares = sumOfSquares / count;
        rms = Math.sqrt(sumOfSquares);

        // Printing the results
        System.out.println();
        System.out.println("The Root Mean Square (RMS) is: " + rms);
    }  else {
        // Notifying the user of invalid input
        System.out.println("No positive numbers were entered");
    }

    }
}