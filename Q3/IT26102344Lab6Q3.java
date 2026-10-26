import java.util.Scanner;
	public class IT26102344Lab6Q3{
		public static void main(String[] args){
			Scanner input=new Scanner(System.in);
			
			int i=-1,squre=0;
			int num=0;
			double rms;
			
			System.out.println("enter positive integers(terminate input with -99)");
			
			
			while(num!=-99){
				if(num>=0){
				squre=squre+(num*num);
				System.out.print("enter a number: ");
				num=input.nextInt();
					i++;
				}
				else{
				System.out.print("please enter a positive integers or -99 to terminate");	
				}
					}
					
				rms=squre/i;
				
				System.out.print("the root mean squre (rms) is: "+rms);	
					
					
					
					
		}			
			}