
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        {

            try {
                Scanner fileScanner = new Scanner(Paths.get(file));

                while (fileScanner.hasNextLine()) {
                    String next = fileScanner.nextLine();
                    if (next.equals( searchedFor)) {
                        System.out.println("Found!");
                        return;
                    }
                }
                System.out.println("Not found");
            } catch (IOException ex) {
                System.out.println("Reading the file " + file + " failed.");
                Logger.getLogger(IsItInTheFile.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
