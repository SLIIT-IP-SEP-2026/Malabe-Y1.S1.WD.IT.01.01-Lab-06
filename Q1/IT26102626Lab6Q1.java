import java.util.Scanner;
public class IT26102626Lab6Q1{
	public static void main (String[]args){
		
		//Declaring variables
		double number,squareNum,rootSquare;
		
		//Creating a Scanner object to read input
		Scanner input = new Scanner(System.in);
		
		//Prompt for user to enter a number
		System.out.print("Enter a number: ");
		number = input.nextDouble();
		
		//Validate the input
		if(number<0){
			System.out.print("Error: The number must be greater than zero");
		}else{
		
		//Calculating square number
		squareNum = number*number;
		//Calculating square root
		rootSquare = Math.sqrt(number);
		
		//Displaying results
		System.out.println();
		System.out.println("The square of " + number +" is: " + squareNum);
		System.out.print("The square root of " + number + " is: " + rootSquare);
		} 
	}
}