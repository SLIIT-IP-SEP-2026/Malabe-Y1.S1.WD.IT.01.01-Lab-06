import java.util.Scanner;
public class IT26102407Lab6Q1{
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		double num , square , squareRoot;
		
		System.out.print("Enter a number: ");
		num = input.nextDouble();
		
		if(num <= 0)
		{
			System.out.print("Error: The number must be greater than zero");
			return;
		}
		else
		{
			square = num*num;
			squareRoot = Math.sqrt (num);
		}
		
		System.out.println();
		System.out.println("The square of " + num + " is: " + square);
		System.out.println("The square root of " + num + " is: " + squareRoot);
		
	}
	
}