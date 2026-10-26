import java.util.Scanner;

public class IT26102472Lab6Q1{
    
    public static void main (String[]args){
        
        Scanner input = new Scanner(System.in);
        
        double number = 0;
        
        System.out.print("Enter a number: ");
        number = input.nextDouble();
        
        System.out.print("\nThe square of " + number + " is : " + (number*number));
        System.out.println("\nThe square root of " + number + " is : " + (Math.sqrt(number)));
        
        input.close();
    }

}