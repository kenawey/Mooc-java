
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mohamed
 */
public class Hand implements Comparable<Hand> {

    private ArrayList<Card> cards;
    

    public int getSize(){
        int sum=0;
    for (Card card : cards){
    sum+=card.getValue();
    }
        
        return sum;
    }
    public Hand() {

        cards = new ArrayList<>();
       
    }
    public void add(Card card){
    cards.add(card);
    
    }
    public void print(){
    cards.forEach((t) -> System.out.println(t));
    }
    public void sort(){
    cards.sort((Card o1,Card o2) ->  o1.compareTo(o2));
    
    }

    @Override
    public int compareTo(Hand o) {
      return this.getSize()-o.getSize();
       
    }
    public void sortBySuit(){
        Collections.sort( cards,new BySuitInValueOrder());
    }

}
