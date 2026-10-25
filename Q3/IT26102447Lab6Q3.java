import java.util.Scanner;
public class 	IT26102447Lab6Q3 {
public static void main(String[] args) {
	
	int number;
	double meanOfSquar , rms;
	
	double sumOfSquar = 0;
	int count = 0;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter positive integer (termnate input with -99:");
	
	while (true) {
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		if (number == -99) {
			break;
		}
		if (number > 0) {
			sumOfSquar += Math.pow(number , 2);
			
			count++;
		}else{ 
		System.out.println("Invalid input. 	Please enetr a positive integer or -99");
		}
	}
	if (count > 0) {
		meanOfSquar = sumOfSquar / count;
		rms = Math.sqrt(meanOfSquar);
		
		System.out.println();
		System.out.println("Ther Root Mean Squar (RMS)IS: " + rms);
	} else{ 
	System.out.println("No numbrs entered.");
	}
}
}