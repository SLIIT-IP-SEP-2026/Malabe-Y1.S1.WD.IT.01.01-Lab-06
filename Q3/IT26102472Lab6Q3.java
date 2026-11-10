import java.util.Scanner;

public class IT26102472Lab6Q3{

    public static void main(String[]args){
    
        Scanner input = new Scanner(System.in);
        
        int number, count=0;
        double rootMeanSquare=0, meanSquare=0;
        
        System.out.println("Enter positive integers (terminate input with -99)");
        
        do{
            System.out.print("Enter a number: ");
            number = input.nextInt();   
            if (number<0 && number!=-99){
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
                continue;
            }
            if (number == -99){
                break;
            }
            count++;
            meanSquare+=(number*number);
            
        }while(number!=-99);
        rootMeanSquare=Math.sqrt((meanSquare/count));
        System.out.println("\n\nThe Root Mean Square (RMS) is : "+rootMeanSquare);
     
    }
}