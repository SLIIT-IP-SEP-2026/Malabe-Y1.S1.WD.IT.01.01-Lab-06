import java.util.Scanner;
public class IT26102594Lab6Q1{
	public static void main(String []args){

Scanner input = new Scanner(System.in);
 double number,square,squareRoot;
 
 
 System.out.print("Enter a number: ");
number = input.nextDouble();

if(number <= 0){
System.out.println("ERROR:The number must be greater than zero ");
}
else{
	square = number*number;

squareRoot = Math.sqrt(number);
	
	
	System.out.println("the square of " + number + " " + "is:" + square );
	System.out.println("The square root of " + number + "is:" + squareRoot );

}
	}
}