import java.util.Scanner;

public class IT26102396Lab6Q2C {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i, number, sum;
		
        i = 1;
		sum = 0;
		
        double average;
		
        String numbers = "";

        System.out.println("Please enter 10 numbers:");

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            number = input.nextInt();
            numbers = numbers + number + " ";
            sum = sum + number;
            i++;
        }

        average = sum / 10.0;

        System.out.println();
        System.out.println("The numbers you entered are:");
        System.out.println(numbers);

        System.out.println();
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}