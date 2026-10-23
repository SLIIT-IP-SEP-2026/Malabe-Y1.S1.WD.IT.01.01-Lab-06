import java.util.Scanner;

public class IT26102648Lab6Q1{
	public static void main(String[]args){
		double number;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		number = input.nextDouble();
		
		if (number<=0){
			System.out.println("Error: The number must be greater than zero");
			return;
		}
		
		System.out.print("\n");
		System.out.println("The square of "+ number +" is : "+ (number*number));
		System.out.println("The square roor of "+ number +" is : "+ (Math.sqrt(number)));
	}
}