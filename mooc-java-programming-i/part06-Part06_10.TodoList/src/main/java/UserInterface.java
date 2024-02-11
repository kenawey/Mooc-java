
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
public class UserInterface {
private TodoList todoList;
private Scanner scanner;
   public  UserInterface(TodoList list, Scanner scanner) {
       todoList = list;
       this.scanner = scanner;
    }
    public void start(){
        
        
        while (true){
        
        System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
//                System.out.println("Bye bye!");
                return;
            } else if (command.equals("add")) {
                System.out.print("Task: ");
                String task = scanner.nextLine();
                todoList.add(task);
            }
            
            else if (command.equals("list"))
            {
                todoList.print();
            
            }
            
            else if (command.equals("remove"))
            {
//                todoList.printTasks();
                System.out.print("Which one is removed?");
                String task = scanner.nextLine();
                todoList.remove(Integer.valueOf(task));
                
                
            }    
            
            }
           
    }
    
    
}
