import java.util.Scanner;
public class IT26102626Lab6Q2B{
	public static void main(String[]args){
		
		//Declare variables
		int count = 1;
		String num = "";
		
		//Creating a Scanner object to get input
		Scanner input = new Scanner(System.in);
	
		System.out.println("Please enter 10 numbers:");
		
		//Continue loop till number is equal to 10
		while(count<=10){
			//Prompt the user to enter a number
			System.out.print("Enter number " + count + ": ");
			
			//Storing the values in a string called num
			num = num + input.nextLine() + " ";
			
			//Increasing count by 1
			count++;
		}
		
		//Display the results
		System.out.println();
		System.out.println("The numbers you entered are:");
		System.out.println(num);
	}
}