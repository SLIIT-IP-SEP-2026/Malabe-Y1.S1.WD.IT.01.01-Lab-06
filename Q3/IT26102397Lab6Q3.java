import java.util.Scanner;

public class IT26102397Lab6Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int count = 0;
        double sumOfSquares = 0;
        double rms;

        System.out.print("Enter positive integers (terminate input with -99): ");
        number = input.nextInt();

        while (number != -99) {

            if (number > 0) {
                sumOfSquares = sumOfSquares
                        + (double) number * number;
                count=count+1;
            } else {
                System.out.println(
                    "Invalid input! Enter a positive integer."
                );
            }

            System.out.print("Enter a positive integer (terminate input with -99): ");
            number = input.nextInt();
        }

        if (count > 0) {
            rms = Math.sqrt(sumOfSquares / count);
            System.out.println("Root Mean Square(RMS) is " + rms);
        } else {
            System.out.println("No valid numbers were entered.");
        }

       
    }
}