
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrintingAFile {

    public static void main(String[] args) {
       
        try {
          Scanner  scanner = new Scanner(Paths.get("data.txt"));
            while (scanner.hasNextLine()) {
                String next = scanner.nextLine();
                System.out.println(next);

            }
        } catch (IOException ex) {
            Logger.getLogger(PrintingAFile.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
