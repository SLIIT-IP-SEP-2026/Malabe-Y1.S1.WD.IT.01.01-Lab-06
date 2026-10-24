import java.util.Scanner;

public class IT26102527Lab6Q3{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		int sqrSum = 0;
		int count = 0;
		
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		while( number != -99){
			if (number > 0){
				sqrSum = sqrSum + (number*number);
				count ++;
				
			}
			else{
				System.out.println("Please enter a positive integer or -99 to terminate: ");
				
			}
			
		System.out.println("Enter a number: ");
		number = sc.nextInt();
			
		}
		if (count != 0){
			double rootMeanSquare = Math.sqrt(sqrSum/count);
			System.out.println("The Root Mean Squareroot is: "+ rootMeanSquare);
		}
		else{
			System.out.println("Programme Terminated");
			
		}

	}
}	
		
		