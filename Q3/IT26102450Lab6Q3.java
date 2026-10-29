import java.util.Scanner;
	public class IT26102450Lab6Q3{
		public static void main(String[] args){
		
			Scanner input = new Scanner(System.in);
			int number ,count = 0;
			double rms, meanofsquare ,sumofsquare = 0;
			
			System.out.println("Enter positive integers (terminate input with -99):");
			
			while (true){
				System.out.println("Enter a number: ");
				number = input.nextInt();
				
				if(number == -99){
					break;
				}
				if(number>0){
					sumofsquare += Math.pow(number ,2);
					count++;
				}else{
				System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
				}
			}
			if(count>0){
				meanofsquare = sumofsquare/count;
				rms = Math.sqrt(meanofsquare);
				
				System.out.println();
				System.out.println("The Root Mean Square (RMS) is: "+rms);
			}
		}	
	}			
			