import java.util.Scanner;
  public class RootMeanSquareCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sumOfSquares = 0;
        int count = 0;
        
        System.out.println("Enter the positive number:");
        
        while (true) {
            System.out.print("Enter number: ");
            
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); 
                continue;
            }
            
            int input = scanner.nextInt();
            
            if (input == -99) {
                break;
            }
            
            if (input < 0) {
                System.out.println(" Error: Negative numbers are not allowed. Please enter a positive integer.");
                continue;
            }
          
            sumOfSquares += (input * input);
            count++;
        }
        
        if (count == 0) {
            System.out.println("");
        } else {
            double rms = Math.sqrt((double) sumOfSquares / count);
            System.out.printf("");
            System.out.printf("Total valid numbers entered ", count);
            System.out.printf("Summation of squares ", sumOfSquares);
            System.out.printf("Root Mean Square ", rms);
        }
        
        scanner.close();
    }
}