import java.util.Scanner;
public class IT26102367Lab6Q1{
	public static void main(String[]args){
		
		Scanner input=new Scanner(System.in);
		
		double num,square,squareRoot;
		
		System.out.print("Enter a number: ");
		num=input.nextDouble();
		
		square=num*num;
		squareRoot= Math.sqrt(num);
		
		System.out.println("The square of " + num + " is : " + square);
		System.out.print("The square root of " + num + " is : " + squareRoot);
		
	}
}