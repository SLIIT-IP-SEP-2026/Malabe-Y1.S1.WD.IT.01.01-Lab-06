import java.util.Scanner;

public class IT26102527Lab6Q1{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		double number, square, sqrt;
		
		System.out.print("Enter a number: ");
		number = sc.nextDouble();
		
		square =  number*number;
		sqrt = Math.sqrt(number);
		
		System.out.println();
		System.out.println("The square of "+number + " is: "+ square);
		System.out.println("The square root of "+number + " is: "+sqrt);
	}
}