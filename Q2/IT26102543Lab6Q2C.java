import java.util.Scanner;
public class IT26102543Lab6Q2C{
	public static void main(String[]args){
		int count=1;
		String num=" ";
		int number;
		int totvalue=0;
		double avg;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter 10 numbers:");
		while(count<=10){
			System.out.print("Enter number " + count +":");
			number=input.nextInt();
			num=num + number+" ";
			totvalue=totvalue +number;
			count++;
		}
			avg=totvalue/10.0;
			System.out.println();
			System.out.println("The numbers you entered are:");
			System.out.println(num);
			System.out.println();
			System.out.println("Sum of the numbers:" + totvalue);
			System.out.print("Average of the numbers:" + avg);
		}
}

		
			
			
