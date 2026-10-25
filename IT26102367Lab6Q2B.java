import java.util.Scanner;
public class IT26102367Lab6Q2B{
	public static void main(String[]args){
		
	Scanner input=new Scanner(System.in);
	
	
	int i=1;
	int num,numbers;
	System.out.println("Please enter 10 numbers:");
	
	while(i<=10){
		
		
		System.out.print("Enter number " + i +":");
		num = input.nextInt();
		
		numbers=num;
		i++;
		
	}
	
	System.out.print("\nThe numbers you entertd are:");
	
	System.out.print(numbers);
	
	
  }
}