import java.util.Scanner;

public class IT26102095Lab6Q2C {
    public static void main(String[] args) {
        int number;
		int count=1;
		String result=" ";
		int sum=0;
		double average;
		
        Scanner input = new Scanner(System.in);
			
	while(count<=10)
	{ System.out.print("Enter number"+count +":");
		number=input.nextInt();
		count=count+1;
		result=result+number+ " " ;
		sum=sum+number;
	}
	average=sum/10;
	System.out.println("The numbers you entered are :" +result+ " ");
	System.out.println("Sum of the numbers :" +sum);
	System.out.println("Average of the numbers :" +average);
	}
}
