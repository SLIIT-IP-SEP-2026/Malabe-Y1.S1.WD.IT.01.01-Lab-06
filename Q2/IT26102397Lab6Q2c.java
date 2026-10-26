import java.util.Scanner;

public class IT26102397Lab6Q2c{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int count = 1;
        int sum = 0;
        double average;

        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            number = input.nextInt();

            sum = sum + number;
            count=count+1;
        }

        average = sum / 10.0;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        
    }
}