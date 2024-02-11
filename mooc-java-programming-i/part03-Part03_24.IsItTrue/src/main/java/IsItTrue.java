
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string: ");
        String answer = scanner.nextLine();
        String result = (answer.equals("true")) ? "You got it right!" : "Try again!";
        System.out.println(result);

    }
}
