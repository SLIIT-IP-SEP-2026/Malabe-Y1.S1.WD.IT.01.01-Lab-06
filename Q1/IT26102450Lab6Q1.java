import java.util.Scanner;

public class IT26102450Lab6Q1 {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	
		double square = 1 , squareroot , number;
		System.out.print("Enter the number:");
		number = input.nextInt();
		
		square = number*number;
		squareroot = Math.sqrt(number);
		
	System.out.println();
	System.out.println("The square of " +number+ " is:"+square);
	System.out.println("The square root of " +number+ " is:"+squareroot);
	}	
}		
		
		
		
		
		
		
		
    
