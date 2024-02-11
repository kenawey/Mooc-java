
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
public class BoxWithMaxWeight extends Box {

    private int max;
    

    public BoxWithMaxWeight(int capacity) {
        this.max = capacity;
        items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int weights = 0;
        for (Item i : items) {
            weights += i.getWeight();
        }
        if (item.getWeight() <= this.max - weights) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
       return items.contains(item);
    }

}
