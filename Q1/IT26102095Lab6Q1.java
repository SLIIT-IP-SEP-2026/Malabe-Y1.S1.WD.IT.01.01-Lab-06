import java.util.Scanner;

public class IT26102095Lab6Q1 {
    public static void main(String[] args) {
        int number;
		double square, square_root;
        Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
    number=input.nextInt();
	square=number*number;
	square_root= Math.sqrt(number);
	
	System.out.println("The square of " +number+ " is: "+square);
	System.out.print("The square_root of " +number+ " is: "+square_root);
	}
}

	
	
	