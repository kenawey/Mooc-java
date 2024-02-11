
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed
 */
public class OneItemBox extends Box {
    public OneItemBox()
    {
        items=new ArrayList<>();
    
    }

    @Override
    public void add(Item item) {
       if(items.size()<1){
           items.add(item);
       } 
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
    
}
