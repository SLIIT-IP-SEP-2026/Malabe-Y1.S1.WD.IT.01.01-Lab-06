import java.util.Scanner;

public class IT26102648Lab6Q3{
	public static void main(String[]args){
		int number,count = 0;
		double total=0,rootMeanSquare;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter positive integers (terminate input with -99):");
		
		
		while (true){
			System.out.print("Enter a number: ");
			number = sc.nextInt();
			
			if(number == (-99)){
				break;
			}
			
			if(number<0){
				System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
			} else {
				total = total + (Math.pow(number,2));
				count++;
			}
		}
		if (count > 0){
			rootMeanSquare = Math.sqrt(total/count);
			System.out.print("The Root Mean Square (RMS) is: " + rootMeanSquare);
		} else {
			System.out.print("No positive numbers were entered");
		}
	}
}