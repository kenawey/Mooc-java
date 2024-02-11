
import com.sun.tools.classfile.Annotation;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        List<String> data = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String next[] = fileScanner.nextLine().split(",");
                int age = Integer.valueOf(next[1]);
                String yearsOrYear = (age == 1) ? " year" : " years";
                data.add(next[0] + ", age: " + next[1] + yearsOrYear);

            }

        } catch (Exception e) {
        }
        data.forEach((element) -> {
            System.out.println(element);
        });

    }
}
