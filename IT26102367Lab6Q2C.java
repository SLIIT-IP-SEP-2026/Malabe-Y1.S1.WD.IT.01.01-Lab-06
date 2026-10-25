
import java.util.Scanner;

public class IT26102367Lab6Q2C {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 1;
		String result= " ";
		int sum=0;
		double avg;
		
        System.out.println("Please enter 10 numbers:");

        while (i <= 10) {
            System.out.println("Enter number " + i + " ");
            int number = input.nextInt();

            result = result + number + " ";
			sum=sum+number;

            i++;
        }
		avg=sum/10;

        System.out.println("The numbers you entered are:");
        System.out.println(result);
		System.out.println(sum);
		System.out.println(avg);
    }
}
