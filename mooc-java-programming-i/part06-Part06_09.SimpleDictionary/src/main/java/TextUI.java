
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mohamed Mostafa
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        dictionary = simpleDictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                return;
            } else if (command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();

                System.out.print("Translation: ");
                String trans = scanner.nextLine();
                dictionary.add(word, trans);
            }
            
            else if (command.equals("search"))
            {
                 System.out.print("To be translated: ");
                String word = scanner.nextLine();
                String trans = dictionary.translate(word),result;
                if(trans.equals("null")){
                result = "Word "+word+" was not found";
                }
                else 
                    result = "Translation: "+trans ;
                
                
                System.out.println(result);
              
            
            }
            
            else {
                System.out.println("Unknown command");
            }
        }
    }

}
