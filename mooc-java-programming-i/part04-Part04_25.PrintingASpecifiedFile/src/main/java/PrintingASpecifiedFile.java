
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String answer = scanner.nextLine();
        scanner = new Scanner(Paths.get(answer));
        while (scanner.hasNextLine()) {
            String next = scanner.nextLine();
            System.out.println(next);

        }

    }
}
