
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        while (!answer.isEmpty()) {
            String[] myStrings = answer.split(" ");
            System.out.println(myStrings[0]);
            answer = scanner.nextLine();

        }

    }
}
