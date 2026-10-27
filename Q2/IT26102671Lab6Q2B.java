import java.util.Scanner;

public class IT26102671Lab6Q2B {

    public static void main(String[] args) {

        // Declaring variables
        int num;
        String numbers = "";
        int i = 1;

        // Create new Scanner input
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter 10 numbers: ");
        
        // Getting input from user
        while (i <= 10){
            System.out.print("Enter number " + i + ": ");
            num = input.nextInt();

            if (i == 0){
                numbers = numbers + num;
            } else{
                numbers = numbers + " " + num;
            }

            i++;
        }

        // Displaying the output
        System.out.println();
        System.out.println("The numbers you entered are: ");
        System.out.println(numbers);


    }
}