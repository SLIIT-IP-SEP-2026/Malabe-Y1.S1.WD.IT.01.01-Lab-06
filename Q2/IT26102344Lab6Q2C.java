import java.util.Scanner;
	public class  IT26102344Lab6Q2C{
		public static void main(String[] args){
			Scanner input=new Scanner(System.in);
			
			double average;
			int sum=0;
			int i=0;
			int[] number = new int[10];
			System.out.println("please enter 10 numbers: ");
			
			while(i<10){
				System.out.print("enter number "+(i+1)+":");
				number[i]=input.nextInt();
				sum+= number[i];
				i++;
			}
			i=0;
			System.out.print("the numbers you entered are: ");
			
			while(i<10){
				System.out.print(number[i]+" ");
				i++;
			}
			System.out.println();
			System.out.println("sum of the numbers: "+sum);
			average=sum/i;
			System.out.println("average of the numbers: "+average);
			
			
			
			
		}
	}
