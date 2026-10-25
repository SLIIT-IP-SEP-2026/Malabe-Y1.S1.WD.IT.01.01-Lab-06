import java.util.Scanner;
public class 	IT26102447Lab6Q1 {
public static void main(String[] args) {
	double squar , squarRoot , number;
	
Scanner input = new Scanner(System.in);	

System.out.print("Enter a nymber: ");
number = input.nextDouble();

if (number <= 0) {
	System.out.print("Error: The number must be greaqter than zero");
}
else{
	squar = number * number;
	squarRoot = Math.sqrt(number);
	System.out.println();
	System.out.println("The squar of " + number + " is: " +squar);
	System.out.println("The squarRoot of " + number + " is" + squarRoot);
}
}
}

	