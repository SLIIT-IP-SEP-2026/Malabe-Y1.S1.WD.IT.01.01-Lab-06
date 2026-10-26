import java.util.Scanner;

public class IT26102461Lab6Q3{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        int num;
        int count = 0;
        double sum = 0;
        double rms;

        System.out.println("Enter positive integers (terminate input with -99):");

        System.out.print("Enter a number: ");
        num=input.nextInt();

        while(num != -99){

            if(num < 0){
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
            }else{
                sum = sum + (num * num);
                count++;
            }

            System.out.print("Enter a number: ");
            num = input.nextInt();
        }

        if(count > 0){
            rms = Math.sqrt(sum / count);
            System.out.println("\nThe Root Mean Square (RMS) is: " + rms);
        }else{
            System.out.println("No valid numbers were entered.");
        }

        input.close();
    }
}