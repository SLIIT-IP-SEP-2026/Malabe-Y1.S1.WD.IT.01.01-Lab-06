import java.util.Scanner;
public class IT26102540Lab6Q2C
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int no1,no2,no3,no4,no5,no6,no7,no8,no9,no10;
        int count = 1;
        final double no = 10;
        
        System.out.println("Please enter 10 numbers");
        System.out.print("Enter number 1:");
        no1 = input.nextInt();
        System.out.print("Enter number 2:");
        no2 = input.nextInt();
        System.out.print("Enter number 3:");
        no3 = input.nextInt();
        System.out.print("Enter number 4:");
        no4 = input.nextInt();
        System.out.print("Enter number 5:");
        no5 = input.nextInt();
        System.out.print("Enter number 6:");
        no6 = input.nextInt();
        System.out.print("Enter number 7:");
        no7 = input.nextInt();
        System.out.print("Enter number 8:");
        no8 = input.nextInt();
        System.out.print("Enter number 9:");
        no9 = input.nextInt();
        System.out.print("Enter number 10:");
        no10 = input.nextInt();
        while (count<=10) {
        count = count+1;
        }
        System.out.println(" ");
        System.out.println("The numbers you entered are:");
        System.out.println(+no1+" "+no2+" "+no3+" "+no4+" "+no5+" "+no6+" "+no7+" "+no8+" "+no9+" "+no10);

        int sum = no1+no2+no3+no4+no5+no6+no7+no8+no9+no10;
        double Avg = sum/no;

        System.out.println(" ");
        System.out.println("Sum of the numbers:"+sum);
        System.out.print("Average of the numbers:"+Avg);
    }
}