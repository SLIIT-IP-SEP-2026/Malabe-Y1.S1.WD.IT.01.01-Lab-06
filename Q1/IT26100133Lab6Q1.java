
import java.util.Scanner;

public class IT26100133Lab6Q1
{
	public static void main(String[] args)
	{
		double number, square, squareRoot;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		number = input.nextDouble();

		square = number * number;
		squareRoot = Math.sqrt(number);

		System.out.println("Square: " + square);
		System.out.println("Square Root: " + squareRoot);

		
	}
}
