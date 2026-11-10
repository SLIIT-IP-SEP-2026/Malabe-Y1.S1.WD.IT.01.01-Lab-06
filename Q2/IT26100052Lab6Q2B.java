import java.util.Scanner;

public class IT26100052Lab6Q2B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int count = 1;

        System.out.println("Please enter 10 numbers:");

        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            number = input.nextInt();

            System.out.print(number + " ");
            count++;
        }

        input.close();
    }
}