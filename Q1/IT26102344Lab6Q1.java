import java.util.Scanner;
	public class IT26102344Lab6Q1{
		public static void main(String[] args){
			Scanner input=new Scanner(System.in);
			
			double number,square,squareroot;
			
			System.out.print("enter a number: ");
			number=input.nextDouble();
			
			squareroot=Math.sqrt(number);
			square=number*number;
			
			System.out.println("the square of "+number+"is : "+square );
			System.out.println("the square root of "+number+"is : "+squareroot );
			
		}
	}