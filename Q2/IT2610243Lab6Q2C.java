import java.util.Scanner;

public class IT2610243Lab6Q2C {

    public static void main(String[] args) {
		int i = 1;
        int number;
        int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		int number4 = 0;
		int number5 = 0;
		int number6 = 0;
		int number7 = 0;
		int number8 = 0;
		int number9 = 0;
		int number10 = 0;
		int sum; 
		double avg;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 10 numbers:");
		
	while (i <= 10) {
		System.out.print("Enter number " + i + ": ");
		number = input.nextInt();

		if (i == 1) {
			number1 = number;
		} else if (i == 2) {
			number2 = number;
		} else if (i == 3) {
			number3 = number;
		} else if (i == 4) {
			number4 = number;
		} else if (i == 5) {
			number5 = number;
		} else if (i == 6) {
			number6 = number;
		} else if (i == 7) {
			number7 = number;
		} else if (i == 8) {
			number8 = number;
		} else if (i == 9) {
			number9 = number;
		} else {
			number10 = number;
		}

		i++;
		}
        System.out.println();
        System.out.println("The numbers you entered are:");
        System.out.println(number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5 + " " + number6 + " " + number7 + " " + number8 + " " + number9 + " " + number10);
		
		sum = number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8 + number9 + number10;
		avg = sum / 10; 
		
		System.out.println("Sum of the Numbers entered: " + sum);
		System.out.println("Avergae of the Numbers entered " + avg);
		
    }
}