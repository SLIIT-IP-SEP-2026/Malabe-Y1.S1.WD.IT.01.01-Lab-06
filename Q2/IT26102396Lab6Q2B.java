import java.util.Scanner;

public class IT26102396Lab6Q2B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i, number;
		
        i = 1;
		
        String numbers = "";

        System.out.println("Please enter 10 numbers:");

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            number = input.nextInt();
            numbers = numbers + number + " ";
            i++;
        }

        System.out.println();
        System.out.println("The numbers you entered are:");
        System.out.println(numbers);
    }
}