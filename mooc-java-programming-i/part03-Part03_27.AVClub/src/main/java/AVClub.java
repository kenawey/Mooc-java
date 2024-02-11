
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        while (!answer.isEmpty()) {
            String[] myStrings = answer.split(" ");
            printArray(myStrings);
            answer = scanner.nextLine();

        }

    }

    public static void printArray(String Arr[]) {

        for (String i : Arr) {
            if (i.contains("av")) {
                System.out.println(i);
            }
        }
    }
}
