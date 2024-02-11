
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        while (!answer.isEmpty()) {
            String[] myStrings = answer.split(" ");
            System.out.println(myStrings[myStrings.length - 1]);
            answer = scanner.nextLine();

        }

    }
}
