import java.util.Scanner;
public class IT26102540Lab6Q1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        
        double no1 = input.nextDouble();
        double sqr = no1*no1;
        double squareroot = Math.sqrt(no1);

        System.out.println("");
        System.out.println("The Square of "+no1+" is:"+sqr); 
        System.out.print("The squareroot of "+no1+" number is:"+squareroot);
    }
}