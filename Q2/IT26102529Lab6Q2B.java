
import java.util.Scanner;

public class IT26102529Lab6Q2C {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 1;
		String result= " ";
		int sum=0
		double avg;
		
        System.out.println("Please enter 10 numbers:");

        while (i <= 10) {
            System.out.println("Enter number " + i + " ");
            int number = input.nextInt();

            result = result + number + " ";
		

            i++;
        }

        System.out.println("The numbers you entered are:");
        System.out.println(result);

    }
}
