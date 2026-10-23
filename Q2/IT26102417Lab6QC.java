import java.util.Scanner;
public class IT26102417Lab6QC{
     public static void main(String[]args){
	  
	      Scanner input = new Scanner(System.in);
		  
		  int number; 
		  int sum = 0;
          double aver;
          int i = 1;

		  
          System.out.println("PLease enter 10 numbers :");
          System.out.println("The numbers you entered are: ");
		   
          while(i <= 10){
               System.out.print("Enter number " + i  + ": ");	
               number = input.nextInt();
               
			  
			   
   			   i ++;
			   
			   sum = sum + number ; 
			   
		  }
	  	  
		   
		  
		  aver = sum/10;
		  
		   
		  
		   
		  System.out.println("sum = "+sum);
		  System.out.println("average = " + aver );
		   
		   
             }
      }
		  