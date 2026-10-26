import java.util.Scanner;

public class IT26101227Lab6Q2B{
	
	public static void main(String[]args){
		
		int number, count = 1;
		String numbers ="";
		
		Scanner input = new Scanner(System.in);		
		System.out.println("Please enter 10 numbers:");
		
		while (count <= 10){
			System.out.print("Enter number " + count + ": ");
			number = input.nextInt();
			
			numbers = numbers + number + " ";
			count++;
		}
		
		System.out.println();
		System.out.println("The numbers you entered are:");
		System.out.println(numbers);
	}
}