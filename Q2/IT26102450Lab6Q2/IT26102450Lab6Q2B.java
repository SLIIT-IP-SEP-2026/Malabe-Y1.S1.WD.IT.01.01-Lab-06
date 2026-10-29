import java.util.Scanner;

	public class IT26102450Lab6Q2B {
	
		public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter 10 numbers:");
		
			int count = 1;
			String numbers = "";
			while(count<=10){
		        
				System.out.print("Enter number "+count+": ");
				int number = input.nextInt();
	            
				numbers = numbers + number +" ";
	
				count++;
			}
			System.out.println("The numbers you entered are:");
				System.out.print(numbers);	
			
		}
	}	