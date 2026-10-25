import java.util.Scanner;

public class IT26102095Lab6Q2B {
    public static void main(String[] args) {
        int number;
		int count=1;
		String result=" ";
		
        Scanner input = new Scanner(System.in);
		
	while(count<=10)
	{ System.out.print("Enter number"+count +":");
		number=input.nextInt();
		count=count+1;
		result=result+number+ " " ;
	}
	System.out.println("The numbers you entered are" +result+ " ");
	}
}

		