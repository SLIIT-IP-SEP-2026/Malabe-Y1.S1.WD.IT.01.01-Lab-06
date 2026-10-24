import java.util.Scanner;

public class IT26102527Lab6Q2C{
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter 10 numbers: ");
		int count = 1;
		int number = 0;
		int sum = 0;
		double average ;
		
		String all_numbers = "";
		
		while (count<= 10){
			System.out.print("Enter  number "+ count + ": ");
			number = input.nextInt();
			sum += number;
			all_numbers = all_numbers + number + " ";
			count ++;
			
			
		
		
		}
		
		average = sum /10.0;
		System.out.println("The numbers you entered are: ");
		System.out.println(all_numbers);
		System.out.println();
		System.out.println("Sum is: "+ sum);
		System.out.print("Average is: "+ average);
		
	}
}	