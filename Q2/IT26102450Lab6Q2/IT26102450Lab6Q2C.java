import java.util.Scanner;

	public class IT26102450Lab6Q2C {
	
		public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter 10 numbers:");
			
			double total=0,avg;
			int count = 1;
			String numbers = "";
			while(count<=10){
		        
				System.out.print("Enter number "+count+": ");
				int number = input.nextInt();
	            
				numbers = numbers + number +" ";
				total = total + number;
				count++;
			}
			System.out.println("The numbers you entered are:");
			System.out.print(numbers);	
			
			avg = total /10;
			System.out.println();
			System.out.println(" ");
			System.out.println("Sum of the numbers:" +total);
			System.out.println("average of the numbers:" +avg);
			
		}
	}	