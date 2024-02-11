
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File to read: ");
        String fileName = scanner.nextLine();
        ArrayList<Item> content = new ArrayList<>();
        try {
            Scanner scannerFile = new Scanner(new File(fileName));
            while (scannerFile.hasNextLine()) {
                String nameOrIngredients = scannerFile.nextLine();
                if (scannerFile.hasNextInt()) {
                    content.add(new Item(nameOrIngredients, scannerFile.nextInt()));

                } else {
                    content.get(content.size() - 1).addIngredients(nameOrIngredients);
                }

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(RecipeSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(
                "Commands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n"
                + "\n");
        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                System.out.println("\nRecipes:");
                for (Item item : content) {
                    System.out.println(item);

                }
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searchedW = scanner.nextLine();
                System.out.println("\nRecipes:");
                for (Item item : content) {
                    if ( item.getName().contains(searchedW)) {
                        System.out.println(item);
                        
                    }
                }

            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int searchedT = Integer.valueOf(scanner.nextLine());
                System.out.println("\nRecipes:");
                for (Item item : content) {
                    if (item.getExecutionTime() <= searchedT) {
                        System.out.println(item);

                    }
                }

            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String searchedI = scanner.nextLine();
                System.out.println("\nRecipes:");
                for (Item item : content) {
                    if (item.getIngredients().contains(searchedI)) {
                        System.out.println(item);

                    }
                }

            }

        }

    }
}
