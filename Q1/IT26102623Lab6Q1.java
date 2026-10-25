import java.util.Scanner;

public class IT26102623Lab6Q1
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		double number, square, sqrt;
		
		System.out.println("Enter a Number");
		number = input.nextDouble();
		
		square = number*number;
		sqrt = Math.sqrt(number);
		
		System.out.println("The square of the number is : "+square);
		System.out.println("The squareroot of the number is : "+sqrt);
	}
}
		
		
		