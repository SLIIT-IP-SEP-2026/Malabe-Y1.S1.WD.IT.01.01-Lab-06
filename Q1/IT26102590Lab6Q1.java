import java.util.Scanner;

public class IT26102590Lab6Q1
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		
		
		System.out.print("Enter the number:");
		double number= input.nextInt();
		
		
		if(number<=0){
			System.out.println("Error: The number must be greater than zero");
		}
		else{
		double squareOfTheNumber= number*number;
		double squareRootOfTheNumber= Math.sqrt(number);
		
		System.out.println("The square of"  +number +" is:" +squareOfTheNumber );
		
		System.out.println("The square root" +number +" is:" +squareRootOfTheNumber);
		
		}
		
	}
}