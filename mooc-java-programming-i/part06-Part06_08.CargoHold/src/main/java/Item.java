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
    
    private String name;
    private int weight;

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }
    public int getWeight(){
        return weight;
    }

    @Override
    public String toString() { 
        return name + " (" + weight + " kg)";
    }

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    

    
}
