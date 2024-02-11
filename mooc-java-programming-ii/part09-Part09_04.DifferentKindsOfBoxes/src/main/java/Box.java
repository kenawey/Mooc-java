
import java.util.ArrayList;

public abstract class Box {

    public abstract void add(Item item);
    protected ArrayList<Item> items;

    public void add(ArrayList<Item> items) {
        for (Item item : items) {
            Box.this.add(item);
        }
    }

    public abstract boolean isInBox(Item item);
}
