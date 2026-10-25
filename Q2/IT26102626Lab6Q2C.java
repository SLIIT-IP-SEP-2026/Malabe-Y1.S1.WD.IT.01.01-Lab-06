import java.util.Scanner;
public class IT26102626Lab6Q2C{
	public static void main(String[]args){
		
		//Declare variables
		int count = 1;
		String num = "";
		int number;
		int totValue = 0;
		double avg;
		
		//Creating a Scanner object to get input
		Scanner input = new Scanner(System.in);
	
		System.out.println("Please enter 10 numbers:");
		
		//Continue loop till number is equal to 10
		while(count<=10){
			//Prompt the user to enter a number
			System.out.print("Enter number " + count + ": ");
			
			//Recieve user input and store it in an integer variable for total and average calculations
			number = input.nextInt();
			
			//Storing the values in a string called num
			num = num + number  + " ";
			
			//Updating the new total
			totValue = totValue + number;
			
			//Increasing count by 1
			count++;
		}
		
		//Calculating the average
		avg = totValue/10.0;
		
		//Display the results
		System.out.println();
		System.out.println("The numbers you entered are:");
		System.out.println(num);
		System.out.println();
		System.out.println("Sum of the numbers: " + totValue);
		System.out.print("Average of the numbers: " + avg);
	}
}