
import java.util.Objects;

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
    private String id;
    
    
    public Item(String id ,String name){
        this.name=name;
        this.id =id;
    
    }
   
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  id +  ": "  + name ;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    

    
}
