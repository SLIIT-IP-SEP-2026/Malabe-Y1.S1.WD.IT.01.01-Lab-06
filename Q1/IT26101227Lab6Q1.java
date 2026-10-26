import java.util.Scanner;

public class IT26101227Lab6Q1{
	
	public static void main (String[] args){
		
		int number;
		double squareNumber, squareRoot;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		if (number <= 0){
			System.out.print("Error: The number must be greater than zero");
		}
		
		else{
			squareNumber = number * number;
			squareRoot = Math.sqrt(number);
			
			System.out.println();
			System.out.println("The square of "+ number +" is: " + squareNumber);
			System.out.println("The square root of "+ number +" is: " + squareRoot);
		}
		
	}
}