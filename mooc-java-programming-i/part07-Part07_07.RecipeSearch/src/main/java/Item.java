
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
public class Item {
   private  String name;
   private  int executionTime;
   
    private ArrayList<String> ingredients;

    /**
     * Get the value of ingredients
     *
     * @return the value of ingredients
     */
    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public Item(String name, int executionTime) {
        this.name = name;
        this.executionTime = executionTime;
        this.ingredients=new ArrayList<>(0);
    }

    @Override
    public String toString() {
        return name+", cooking time: "+executionTime; //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public int getExecutionTime() {
        return executionTime;
    }
    public void addIngredients(String ingredient){
    
    ingredients.add(ingredient);
    
    }
    
   
   
    
}
