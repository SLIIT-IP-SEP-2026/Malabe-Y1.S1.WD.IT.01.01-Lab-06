import java.util.Scanner;
public class IT26102626Lab6Q3{
	public static void main(String[]args){
		int number;
		double meanOfSquares,rms;
		
		double sumOfSquares = 0;
		int count = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter positive integers (Terminate input with -99):");
		
		//Creates an infinite loop that terminates only when number is -99
		while(true){
			//Prompt for user to enter a number
			System.out.print("Enter a number: ");
			number = input.nextInt();
			
			if(number == -99){
				//Exit loop
				break;
			}
			if(number > 0){
				//Update the sum of squares and count
				sumOfSquares += Math.pow(number,2);
				count++;
			}else {
				//Notify user of invalid input (Negative number other than -99)
				System.out.println("Invalid input. Please enter a positive integer or -99");
			}
		}
		//Check if any valid numbers were entered 
		if(count>0){
			//Calculate Root Mean Square (RMS)
			meanOfSquares = sumOfSquares/count;
			rms = Math.sqrt(meanOfSquares);
			
			//Print the RMS result
			System.out.println();
			System.out.println("The Root Mean Square(RMS) is: " + rms);
		}
		else{
			//Notify user of invalid input (Negative number other than -99)
			System.out.println("No positive numbers were entered ");
		} 
	}
}