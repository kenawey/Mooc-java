
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String answer = scanner.nextLine();
            if (answer.isEmpty()) {
                //System.out.println("halted");
                return;
            }

            String stringArray[] = answer.split(" ");
            for (String i : stringArray) {
                System.out.println(i);
            }

        }

    }
}
