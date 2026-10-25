import java.util.Scanner;

public class IT26102401Lab6Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = input.nextDouble();

        System.out.println("The square of " + num + " is : " + (num * num));
        System.out.println("The square root of " + num + " is : " + Math.sqrt(num));
    }
}