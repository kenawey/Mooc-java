
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
public class Stack {

    private ArrayList<String> myStack;

    public Stack() {
        myStack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return myStack.isEmpty();
    }

    public void add(String value) {
        myStack.add(value);

    }

    public String take(){
        
    String result= myStack.get(myStack.size()-1);
    myStack.remove(result);
    return result;
    }

    public ArrayList<String> values() {
        return  myStack;
    }
}
