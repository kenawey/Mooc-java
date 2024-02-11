
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed
 */
public class Hideout<T> {
T hideout;
    public Hideout() {
        
    }
    public void putIntoHideout(T toHide)
    {
      hideout=toHide;
    
    }

    public T takeFromHideout()
    {
       T t =hideout;
       hideout=null;
       return t;
    }
    public boolean isInHideout(){
        return hideout!=null;
    }
}
