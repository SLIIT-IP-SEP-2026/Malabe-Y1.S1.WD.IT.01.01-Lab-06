import java.util.Scanner;

public class IT26101970Lab6Q2C {

    public static void main(String[] args) {

        // Declaring variables
        int num;
        String numbers = "";
        int i = 1;
        int sum = 0;
        double average = 0;

        // Create new Scanner input
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter 10 numbers: ");
        
        // Getting input from user
        while (i <= 10){
            System.out.print("Enter number " + i + ": ");
            num = input.nextInt();
            sum += num;

            if (i == 0){
                numbers = numbers + num;
            } else{
                numbers = numbers + " " + num;
            }

            i++;
        }

        // Calculating the average
        average = sum / 10;

        // Displaying the output
        System.out.println();
        System.out.println("The numbers you entered are: ");
        System.out.println(numbers);
        System.out.println();
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

    }
}
