
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed Mostafa
 */
public class TodoList {
private ArrayList <String > tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void print(){
        for(int i=1;i<=tasks.size();i++)
            System.out.println(i+": "+tasks.get(i-1));
    }
    public void remove(int number){
        tasks.remove(number-1);
    }


 public  void add(String task) {

this.tasks.add(task);
    }
    
}
