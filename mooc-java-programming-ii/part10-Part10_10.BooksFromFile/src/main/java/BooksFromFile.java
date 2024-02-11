
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
    public static List<Book> readBooks(String file){
        try {
          return  Files.lines(Path.of(file)).map(row->row.split(","))
                    .map(array->new Book(array[0],Integer.valueOf( array[1]),Integer.valueOf( array[2]), array[3]))
                    .collect(Collectors.toList());
        } catch (IOException ex) {
            Logger.getLogger(BooksFromFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    return new ArrayList<>();
    }

}
