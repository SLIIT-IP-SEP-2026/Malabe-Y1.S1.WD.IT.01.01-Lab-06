import java.util.Scanner;

 public class IT26102552Lab6Q1{
	
	public static void main(String[] args)
	{
		double Number,square, squareroot ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Number:");
		Number = input.nextDouble();
		if(Number <=0 ){
			System.out.println("Error : The number must be grater than zero"); 
		}
		else
		{
		square = Number * Number;
		squareroot = Math.sqrt(Number);
		
		System.out.println("The square of number is:" + square); 
		System.out.println("The squareroot of number is:" + squareroot);
		}
		
		
    }
 }