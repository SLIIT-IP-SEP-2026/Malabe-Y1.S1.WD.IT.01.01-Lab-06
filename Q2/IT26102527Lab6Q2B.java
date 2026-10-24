import java.util.Scanner;

public class IT26102527Lab6Q2B{
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter 10 numbers: ");
		int count = 1;
		int number = 0;
		String all_numbers = "";
		
		while (count<= 10){
			System.out.print("Enter  number "+ count + ": ");
			number = input.nextInt();
			all_numbers = all_numbers + number + " ";
			
			count ++;
			
			
		
		
		}
		
		System.out.println();
		System.out.println("The numbers you entered are: ");
		System.out.println(all_numbers);
		System.out.println();
		
	
		
	}
}	