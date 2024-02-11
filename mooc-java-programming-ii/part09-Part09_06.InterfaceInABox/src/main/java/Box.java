
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
public class Box implements Packable {

    private double capacity;
    private ArrayList<Packable> content;

   public  Box(double maximumCapacity) {
        this.capacity = maximumCapacity;
        content=new ArrayList<>();
    }

    @Override
    public double weight() {
        double weights=0;
        for(Packable p : content)
            weights+=p.weight();
        return weights;
    }

    @Override
    public String toString() {
        return "Box: "+ content.size()+" items, total weight "+ weight()+" kg" ;//To change body of generated methods, choose Tools | Templates.
    }

   public void add(Packable packable) {
        if(packable.weight()< (capacity-this.weight())){
            content.add(packable);
        }
    }
    

}
