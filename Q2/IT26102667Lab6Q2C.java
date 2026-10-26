import java.util.Scanner;

public class IT26102667Lab6Q2C
{
   public static void main(String [] args)
   {
	   Scanner input = new Scanner(System.in);
	   
	   int count = 1 ;
	   int number = 0 ;
	   int sum = 0;
	   String allNumbers = " ";
	   
	   System.out.println("Please enter 10 numbers :");
	   
	   while (count <= 10)
	   {
		   System.out.print("Enter number " + count + ": ");
		   number = input.nextInt();
		   
		   allNumbers = allNumbers + number + " " ;
		   sum = sum + number;
		   count ++; 
	   }
	   
	   int avg = sum/10;
	   
	   System.out.println();
	   System.out.println("The numbers you entered are :\n" + allNumbers);
		
	   System.out.println();
	   System.out.println("Sum of the numbers : " + sum);
       System.out.println("Average of the numbers : " + avg);		    
   }
}
		   