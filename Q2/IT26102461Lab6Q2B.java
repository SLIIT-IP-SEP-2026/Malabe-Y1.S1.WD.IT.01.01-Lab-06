import java.util.Scanner;
public class IT26102461Lab6Q2B{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int i=1;
		int num;
		
		System.out.println("Please enter 10 numbers:");
		while(i<=10){
			System.out.print("Enter number "+i+":");
			num=input.nextInt();
			System.out.println(num);
			i++;
		}
		input.close();
	}
}
