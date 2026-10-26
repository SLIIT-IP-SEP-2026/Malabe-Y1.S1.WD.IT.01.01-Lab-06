import java.util.Scanner;

public class IT26101227Lab6Q2C{
	
	public static void main(String[]args){
		
		int number, count = 1;
		double sum = 0, average;
		String numbers = "";
		
		Scanner input = new Scanner(System.in);		
		System.out.println("Please enter 10 numbers:");
		
		while (count <= 10){
			System.out.print("Enter number " + count + ": ");
			number = input.nextInt();
			sum = sum + number;
			numbers = numbers + number + " ";
			count++;
		}
		average = sum / 10;
		
		System.out.println();
		System.out.println("The numbers you entered are: ");
		System.out.println(numbers);
		
		System.out.println();
		System.out.println("Sum of numbers: " + sum );
		System.out.println("Average of numbers: " + average);
	}
}