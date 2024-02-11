
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
public class Suitcase {

    private final int maxWeight;

    private ArrayList<Item> items;

    public Suitcase(int weight) {
        this.maxWeight = weight;
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (maxWeight - totalWeight() >= item.getWeight()) {
            items.add(item);

        }
    }

    public int totalWeight() {
        int total = 0;
        for (Item item : items) {
            total += item.getWeight();

        }
        return total;
    }

    public void printItems() {
        items.forEach((item) -> {
            System.out.println(item);
        });
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item big = items.get(0);
        for (Item item : items) {
            if (item.getWeight() > big.getWeight()) {
                big = item;
            }

        }
        return big;
    }

    @Override
    public String toString() {
        String itemSize = (items.size() == 0) ? "no items " : (items.size() == 1) ? "1 item " : items.size() + " items ";

        return itemSize + "(" + totalWeight() + " kg)";
    }

}
