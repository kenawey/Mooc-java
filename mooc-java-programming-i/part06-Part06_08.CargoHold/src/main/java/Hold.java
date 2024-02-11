
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
public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (maxWeight - suitcase.totalWeight() >= 0) {
            suitcases.add(suitcase);
            maxWeight-=suitcase.totalWeight();

        }

    }

    @Override
    public String toString() {
        int totalWeight = 0;
        for (Suitcase item : suitcases) {
            totalWeight += item.totalWeight();

        }
        return suitcases.size() + " suitcases (" + totalWeight + " kg)";
    }

    public void printItems() {

        for (Suitcase suitcase : suitcases) {

            suitcase.printItems();

        }

    }

}
