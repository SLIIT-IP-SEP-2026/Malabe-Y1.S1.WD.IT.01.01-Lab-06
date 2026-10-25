import java.util.Scanner;

public class IT26102623Lab6Q2C
{
	public static void main(String[]args)
	{
		Scanner input= new Scanner(System.in);
		
		
		System.out.println("Please enter 10 numbers:");
		int count = 0;
		int sum = 0 ;
		
		String all_numbers= "";
		
		while (count <10)
		{
			count++;
            System.out.print("Enter number " +count + ": ");
			int number = input.nextInt();
			all_numbers = all_numbers + number + " ";
			sum = sum + number;
        }
		System.out.println("The numbers you entered are: " );
		System.out.println(all_numbers );
		
		
		double avg = sum / 10;
		
		System.out.println("The sum of the numbers you entered : " + sum );
		System.out.println("The average of the numbers you entered: " + avg);
		
		
	}
}