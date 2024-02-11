
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfPositive = 0, counter = 0;
        while (true) {

            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            if (number > 0) {
                sumOfPositive += number;
                counter++;
            }
        }
        String r = sumOfPositive > 0 ? ("Average of the numbers: " + sumOfPositive * 1.0 / counter) : ("Cannot calculate the average");
        System.out.println(r);
    }
}
