import java.util.Scanner;

public class IT26102388Lab6Q2B {

    public static void main(String[] args) {

        int num;
        String numbers = "";
        int i = 1;
		
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter 10 numbers: ");
        
        while (i <= 10){
            System.out.print("Enter number " + i + ": ");
            num = input.nextInt();

            if (i == 0){
                numbers = numbers + num;
            } else{
                numbers = numbers + " " + num;
            }

            i++;
        }

        System.out.println();
        System.out.println("The numbers you entered are: ");
        System.out.println(numbers);


    }
}
