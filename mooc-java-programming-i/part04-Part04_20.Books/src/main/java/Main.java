
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        while (true) {
            System.out.print("Title: ");
            String bookName = scanner.nextLine();

//            String bookName=scanner.nextLine();
            if (bookName.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            books.add(new Book(bookName, pages, year));

        }
        System.out.println();
        System.out.print("What information will be printed? ");
        String answer = scanner.nextLine();
        if (answer.equals("everything")) {

            books.forEach((mybook)
                    -> {
                System.out.println(mybook);

            });
        } else if (answer.equals("name")) {
            books.forEach((mybook)
                    -> {
                System.out.println(mybook.getName());

            });
        }

    }
}
