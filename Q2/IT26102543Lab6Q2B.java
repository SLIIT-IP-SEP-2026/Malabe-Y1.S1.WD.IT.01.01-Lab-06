import java.util.Scanner;
public class IT26102543Lab6Q2B{
	public static void main(String[]args){
		int count=1;
		String num=" ";
		Scanner input=new Scanner (System.in);
		System.out.println("Please enter 10 numbers:");
		while(count <=10){
			System.out.print("Enter number "+count+":");
			num=num+input.nextLine()+" ";
			count++;
		}
			System.out.println();
			System.out.println("The numbers you entered are:");
			System.out.println(num);
		
	}
}

			
			
		
		
		
