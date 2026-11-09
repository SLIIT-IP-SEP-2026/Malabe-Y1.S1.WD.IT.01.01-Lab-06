import java.util.Scanner ;
   public class IT26102388Lab6Q1 {
	   public static void main(String[] args) {
		   
		   Double number , square , square_root ; 
		   
		   Scanner input = new Scanner(System.in);
		   
		   System.out.println("Enter the number:");
		   number = input.nextDouble();
		   
		   if (number <= 0) {
			   System.out.println("Error: The number must be greater than zero");
		   } else {
			   square = number * number ;
			   
			   square_root = Math.sqrt(number);

            System.out.println();
			System.out.println("The square of" + number + "is :" + square);
			System.out.println("The square root of" + number + "is :" + square_root);
		   }
	   }
   }	   
		   