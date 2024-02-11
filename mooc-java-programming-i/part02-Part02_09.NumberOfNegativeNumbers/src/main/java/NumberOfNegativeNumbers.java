
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negativeCounter = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            // (number==0)? System.out.println("Number of negative numbers: "+ negativeCounter) :negativeCounter++;
            negativeCounter = (number < 0) ? negativeCounter + 1 : negativeCounter;
            if (number == 0) {
                System.out.println("Number of negative numbers: " + negativeCounter);
                break;
            }

        }

    }
}
