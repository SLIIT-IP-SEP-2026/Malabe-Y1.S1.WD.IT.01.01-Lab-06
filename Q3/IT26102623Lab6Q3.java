import java.util.Scanner;

public class IT26102623Lab6Q3
{
	public static void main(String[]args)
	{
		Scanner input= new Scanner(System.in);
		double sum,count,num;
		System.out.print("Enter a number: ");
		sum = 0;
		count= 1;
		
		num = input.nextDouble();
		while(num!=-99)
		{
			if(num<=0)
			{
				System.out.println("Invalid Number");
				count = count -1 ;
			    
			}
			sum= sum + (num*num);
			System.out.print("Enter a number: ");
			num = input.nextDouble();
			
			count++ ;
		}
		if ( count!= 1)
		{
			double rms = Math.sqrt(sum/(count-1));
			System.out.println("The answer is " + rms);
		}
		else
		{
			System.out.println("Error : no valid numbers entered");
		}
		
		
	}
}
			
		