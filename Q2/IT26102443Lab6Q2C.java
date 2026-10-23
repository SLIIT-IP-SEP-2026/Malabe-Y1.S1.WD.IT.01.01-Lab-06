import java.util.Scanner;

public class IT26102443Lab6Q2C {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		int count = 1;
		int sum = 0;
		int[] numbers = new int[10];
		
		System.out.println("Please enter 10 numbers: ");
		
		while (count <= 10) {
			
			System.out.print("Enter number " + count + ": ");
			numbers[count - 1] = input.nextInt();
			
			sum = sum + numbers[count -1];
			
			count++;
	
		}
		
		System.out.println("The numbers you entered are: ");
		
		count = 0;
		
		while (count < 10){
			
			System.out.print(numbers[count] + " ");
			
			count++;
		}
		
		double average = sum / 10.0;
		
		System.out.println();
		System.out.println("Sum of the numbers: " + sum);
		System.out.println("Average of the numbers: " + average);
		
		return;
	}
}
		
		