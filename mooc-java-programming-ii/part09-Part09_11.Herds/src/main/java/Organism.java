/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed
 */
public class Organism implements Movable {
private int x,y;
    public Organism(int x, int y){
    this.x=x;
    this.y=y;
    }
    @Override
    public void move(int dx, int dy) {
    x+=dx;
    y+=dy;
    
    }
    public String toString(){
    
    return "x: "+x +"; y: "+y;
    }
        
   
    
}
