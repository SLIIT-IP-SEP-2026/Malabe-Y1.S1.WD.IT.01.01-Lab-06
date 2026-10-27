import java.util.Scanner; 

public class IT26102671Lab6Q2C {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare variables
        int i = 1;       
        int number;       
        int sum = 0;      
        double average;   

        // Repeat the loop 10 times
        while (i <= 10) {

            // Ask the user to enter a number
            System.out.print("Enter number " + i + ": ");

            // Read the number entered by the user
            number = input.nextInt();

            // Add the number to the total sum
            sum = sum + number;

            // Increase the counter by 1
            i++;
        }

        // Calculate the average of 10 numbers
        average = sum / 10.0;

        // Display the final sum
        System.out.println("Sum = " + sum);

        // Display the average
        System.out.println("Average = " + average);

        // Close the Scanner
        input.close();
    }
}
