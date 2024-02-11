
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
public class Herd implements Movable {
private List<Movable> myList;
public Herd(){
myList=new ArrayList<>();
}
    @Override
    public void move(int dx, int dy) {
        myList.forEach(m->{m.move(dx, dy);});
    }
    public void addToHerd(Movable movable){
        myList.add(movable);
    }
    public String toString(){
        StringBuffer stringBuffer=new StringBuffer();
          myList.forEach(m->{ stringBuffer.append( m.toString()+"\n");});
          return stringBuffer.toString();
    }
    
}
