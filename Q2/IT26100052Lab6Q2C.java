import java.util.Scanner;

public class IT26100052Lab6Q2C {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int count = 1;
        int sum = 0;
        double average;

        System.out.println("Please enter 10 numbers:");

        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            number = input.nextInt();

            sum = sum + number;
            count++;
        }

        average = sum / 10.0;

        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        input.close();
    }
}