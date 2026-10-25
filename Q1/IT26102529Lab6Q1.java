
import java.util.Scanner;

public class IT26102529Lab6Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        double square = number * number;
        double squareRoot = Math.sqrt(number);

        System.out.println("The square is "+ square);
        System.out.println("The square root is " +squareRoot);

    }
}
