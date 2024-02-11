
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0,counter=0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                System.out.println("Sum of the numbers: " + sum);
                System.out.println("Number of numbers: " + counter);
                break;
            }
            sum += number;
            counter++;
        
        }

    }
}
