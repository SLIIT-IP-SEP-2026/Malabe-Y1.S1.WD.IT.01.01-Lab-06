import java.util.Scanner;
public class IT26102407Lab6Q2B{
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		int count = 1;
		int num ;
		String numbers = "" ;
		
		System.out.println("Please enter 10 numbers: ");
		 
		while(count <= 10 )
		{
			System.out.print("Enter number " + count + ": ");
			num = input.nextInt();
			
			numbers = numbers + num + " ";
			
			count++;
		}
		
		System.out.println(" ");
		System.out.println("The numbers you entered are: ");
		System.out.print(numbers);
		
	}
	
}