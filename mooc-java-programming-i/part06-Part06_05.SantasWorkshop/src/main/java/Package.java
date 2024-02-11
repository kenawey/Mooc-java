
import com.sun.org.apache.bcel.internal.generic.RETURN;
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
public class Package {
    private ArrayList<Gift> gifts;
    
    public Package(){
    gifts=new ArrayList<>();
    }
    
     public void addGift(Gift gift){
     gifts.add(gift);
     }
    
     public int totalWeight(){
         int weights=0;
      for(Gift gift : gifts)
          weights+=gift.getWeight();
     
     return weights;
     }
     
     
}
