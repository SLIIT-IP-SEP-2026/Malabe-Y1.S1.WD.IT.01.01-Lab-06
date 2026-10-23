import java.util.Scanner;
public class IT26102434Lab6Q3 {
    public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int number, count;
		 double sum, rms;
		 
		 count = 0;
		 sum = 0;
		 
        System.out.println("Enter postive integers (terminate input with -99): ");
		System.out.print("Enter a number: ");	
        number = input.nextInt();	
			while (number != -99){
				if(number < 0) {
					System.out.println("Invalid input. Enter a postive inetger or -99 to terminate. ");
				}else {
					sum = sum + (number *number);
					count = count + 1;
				}
				System.out.print("nter a number: ");
				number = input.nextInt();
			}
			if (count > 0) {
				rms = Math.sqrt(sum/count);
				System.out.println("Root mean square(RMS): " + rms);
				
			}
    }
}