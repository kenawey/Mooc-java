/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed Mostafa
 */
public class Bird {
    private String name;
    private String lName;
    private int observations;

    public Bird(String name, String lName) {
        this.name = name;
        this.lName = lName;
        this.observations=0;
        
    }

    public String getName() {
        return name;
    }

    public String getlName() {
        return lName;
    }
    
    public void addObservation(){
        observations++;
    }

    @Override
    public String toString() {
        return name+" ("+lName+"): "+ observations+" observations"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
