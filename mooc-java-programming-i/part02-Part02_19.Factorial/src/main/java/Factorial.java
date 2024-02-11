
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        int f = 1, factorial = 1;
        while (f <= number) {
            factorial *= f;
            f++;
        }
        System.out.println("Factorial: " + factorial);
    }
}
