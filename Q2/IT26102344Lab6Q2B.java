import java.util.Scanner;
	public class  IT26102344Lab6Q2B{
		public static void main(String[] args){
			Scanner input=new Scanner(System.in);
			
			int i=0;
			int[] number = new int[10];
			System.out.println("please enter 10 numbers: ");
			
			while(i<10){
				System.out.print("enter number "+(i+1)+":");
				number[i]=input.nextInt();
				i++;
			}
			i=0;
			System.out.print("the numbers you entered are: ");
			
			while(i<10){
				System.out.print(number[i]+" ");
				i++;
			}
			
			
			
			
		}
	}
