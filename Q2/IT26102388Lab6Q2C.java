import java.util.Scanner;

public class IT26102388Lab6Q2C {

    public static void main(String[] args) {

        int num;
        String numbers = "";
        int i = 1;
        int sum = 0;
        double average = 0;

        Scanner input = new Scanner (System.in);
        System.out.println("Please enter 10 numbers: ");
        
        while (i <= 10){
            System.out.print("Enter number " + i + ": ");
            num = input.nextInt();
            sum += num;

            if (i == 0){
                numbers = numbers + num;
            } else{
                numbers = numbers + " " + num;
            }

            i++;
        }
		
        average = sum / 10;

        System.out.println();
        System.out.println("The numbers you entered are: ");
        System.out.println(numbers);
        System.out.println();
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

    }
}
