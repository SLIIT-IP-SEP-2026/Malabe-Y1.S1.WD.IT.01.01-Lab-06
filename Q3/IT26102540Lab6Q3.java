import java.util.Scanner;
public class IT26102540Lab6Q3
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    int no1;
    int count = 0;
    double sumsquare = 0;
    System.out.println("Enter positive integers(terminate input with -99)");
    System.out.print("Enter a number:");
    no1 = input.nextInt();
    while(no1 != -99)
    {
       if(no1<0)
        {
         System.out.print("Please enter a positive integer or -99 to terminate");
        }
        else
        {
            sumsquare = sumsquare + (no1*no1);
            count = count+1;
        }
       System.out.print("Enter a number:");
       no1 = input.nextInt();

    }

    if (count > 0 )
    {
    double rms = Math.sqrt(sumsquare/count);
    System.out.println(" ");
    System.out.println("Root Mean Square = " + rms);
    return ;
    }

    }  
}