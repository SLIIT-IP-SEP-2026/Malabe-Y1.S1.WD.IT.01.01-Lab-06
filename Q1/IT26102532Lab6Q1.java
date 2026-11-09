import java.util.Scanner;
  public class NumberCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        double number = scanner.nextDouble();
        
        double square = number * number;
        
        double squareRoot = Math.sqrt(number);
   
        System.out.println("The square of " + number + " is: " + square);
        System.out.println("The square root of " + number + " is: " + squareRoot);
        
        scanner.close();
    }
}