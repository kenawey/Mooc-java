
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give a number:");
        int number=Integer.valueOf( scanner.next());
        System.out.println("You gave the number "+number);
//        System.out.println(number);

    }
}
