import java.util.Scanner;

public class IT26102417Lab6Q3{
     public static void main(String[]args){ 
	 
	 Scanner input = new Scanner(System.in);
	 
	 int count = 0;
	 double sum = 0;
     double RMS ;
     int number;

     System.out.println("Enter the positive integers(terminate input with -99");
	 
	  System.out.print("Enter a number:");
         number = input.nextInt();
	 
	 
	 
	 
	 while( number != -99){
         System.out.print("Enter a number:");
         number = input.nextInt();
		 
		 if(number < 0 ){ 
		 System.out.println("invalid input ,please enter a positive integer");
		 }
			
			else{
			sum = sum + number*number;
	        count ++;
			}
	 }
	   
	     RMS = Math.sqrt(sum/count);
	 
	 System.out.println();
	 System.out.println("The RMS is " + RMS);
	      
	     }
 }