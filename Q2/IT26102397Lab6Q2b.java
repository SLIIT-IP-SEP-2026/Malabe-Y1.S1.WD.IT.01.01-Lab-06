import java.util.Scanner;

public class IT26102397Lab6Q2b{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int count = 1;

        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            number = input.nextInt();

            System.out.print(number + " ");
            count=count+1;
        }
    }
}