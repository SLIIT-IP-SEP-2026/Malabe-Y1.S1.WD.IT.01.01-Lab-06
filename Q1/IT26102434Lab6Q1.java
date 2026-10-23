import java.util.Scanner;

public class IT26102434Lab6Q1 {

    public static void main(String[] args) {

        double square, root, number;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextDouble();

        if (number < 0) {
            System.out.println("Error: Please enter a positive number or zero");
        } else {

            square = number * number;
            root = Math.sqrt(number);

            System.out.println("The square of " + number + " is : " + square);
            System.out.println("The square root of " + number + " is : " + root);
        }
    }
}