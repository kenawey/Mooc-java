/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed
 */
public class TripleTacoBox  implements TacoBox {
    private int tacos ;
    public TripleTacoBox() 
    {
        tacos=3;
        
    }

    
    @Override
    public int tacosRemaining() {

        return tacos;
    }

    @Override
    public void eat() {
        tacos =  tacos==0?0:tacos-1;
    }
    
}
