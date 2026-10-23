import java.util.Scanner;

public class IT26102590Lab6Q2C
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		
		
		System.out.print("Enter the number 1:");
		int number1= input.nextInt();
		
		System.out.print("Enter the number 2:");
		int number2= input.nextInt();
		
		System.out.print("Enter the number 3:");
		int number3= input.nextInt();
		
		System.out.print("Enter the number 4:");
		int number4= input.nextInt();
		
		System.out.print("Enter the number 5:");
		int number5= input.nextInt();
		
		System.out.print("Enter the number 6:");
		int number6= input.nextInt();
		
		System.out.print("Enter the number 7:");
		int number7= input.nextInt();
		
		System.out.print("Enter the number 8:");
		int number8= input.nextInt();
		
		System.out.print("Enter the number 9:");
		int number9= input.nextInt();
		
		System.out.print("Enter the number 10:");
		int number10= input.nextInt();
		
		int sum = number1 + number2 + number3+ number4+ number5+ number6+ number7+ number8+ number9+ number10;
		double average = sum / 10;
		
	
		
		System.out.println("The numbers you entered are:"  +number1 +" "+number2 +" "+number3 +" "+number4 +" "+number5 
		+" "+number6 +" "+number7 +" "+number8 +" "+number9 +" "+number10 );
		
		System.out.println("Sum is:" +sum);
		System.out.println ("Average is:" +average);
		
		
		
		
		
		
	}
}