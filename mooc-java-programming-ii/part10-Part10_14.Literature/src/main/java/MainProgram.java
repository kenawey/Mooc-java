
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books=new ArrayList<>();
        while (true){
            System.out.println("Input the name of the book, empty stops:");
            String input=scanner.nextLine(); 
            if(input.isEmpty()){
            break;
            }
            System.out.println("Input the age recommendation:");
            int recommendation = Integer.parseInt( scanner.nextLine());
           
            books.add(new Book(input, recommendation));
        
        }
        System.out.println(books.size()+ " books in total.\n" +
"\n" +
"Books:");
        //books.forEach(book->System.out.println(book));
      /*  books.sort((Book o1, Book o2) -> {
            
            if(o1.getRecommendation()>o2.getRecommendation())
                return 1;
            if(o1.getRecommendation()<o2.getRecommendation())
                return -1;
            return 0; //To change body of generated lambdas, choose Tools | Templates.
        });
books.forEach(book->System.out.println(book));*/

Comparator <Book> compartor =Comparator.comparing(Book::getRecommendation).thenComparing(Book::getName);
        Collections.sort(books,compartor);
        books.forEach(a->System.out.println(a));
    }

}
