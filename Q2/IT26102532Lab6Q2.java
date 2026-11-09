import java.util.Scanner;
  public class NumberStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String result = "";
        int sum = 0;      
        int count = 1; 
        
        System.out.println("Please enter 10 numbers:");

        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            int number = scanner.nextInt();
            
            sum += number;
            
            result += number + " ";
            
            count++;
        }
        
        scanner.close();
        
        double average = (double) sum / 10;
        
        System.out.println("The number");
        System.out.println(result);
        
        System.out.println("");
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}