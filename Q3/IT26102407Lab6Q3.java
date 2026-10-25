import java.util.Scanner;
public class IT26102407Lab6Q3{
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		int num , sum = 0 , squareOfNum;
		int count = 0;
		double rms;
		
		System.out.println("Enter positive integers(trtminate input with -99): ");
		
		while(true)
		{
			System.out.print("Enter a number: ");
			num = input.nextInt();
		
			if(num == -99)
			{
				break;
			}
		
			if(num < 0)
			{
				System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
				continue;
			}

			squareOfNum = num * num;
			sum = sum +  squareOfNum;
			count++;
		}

		if(count > 0)
		{
			rms =  Math.sqrt(sum/count);
			System.out.println(" ");
			System.out.println("The Root Mean Square (RMS) is: " + rms);
		}
		else
		{
			System.out.println("No positive numbers were enterd");
		}

		
	}
	
}