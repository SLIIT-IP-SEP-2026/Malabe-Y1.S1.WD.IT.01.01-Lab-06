import java.util.Scanner;

public class IT26102590Lab6Q3
{

	public static void main(String[] args)
	{ 
		double sumOfSquares=0;
		int count=0;
		Scanner input = new Scanner (System.in);
		
		
		System.out.print("Enter positive integers(terminate input with -99):");
		
		
		
		while(true){
			System.out.println("enter a number:");
			int number = input.nextInt();
			
			if (number== -99){
			break;
			}
			
			if (number>0){
		   sumOfSquares += Math.pow(number,2);
		   count++;
			
			}
			
			else{
				System.out.println("Invalid Input. Please enter a positive number or -99 to terminate");
				
			}
		}
		if(count>0){
		double meanOfTheSquares= sumOfSquares/ count;
		double rms = Math.sqrt(meanOfTheSquares);
		
		System.out.println();
		
		System.out.println("The Root Mean square(rms) " +rms );
		
		}
		else {
			
		System.out.println("NO positive numbers were entered" );	
		}
		
	}
}