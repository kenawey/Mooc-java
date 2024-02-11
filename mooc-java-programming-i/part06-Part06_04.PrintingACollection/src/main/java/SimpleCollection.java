
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if (elements.isEmpty()) {
            return "The collection "+name+" is empty.";
        }
        String eOrEs= (elements.size()>1)?" elements:\n" : " element:\n" ; //elements or element 
       StringBuffer result= new StringBuffer("The collection "+name+" has "+elements.size()+eOrEs);
        for(int i=0;i<elements.size();i++){
            result.append(elements.get(i));
            if(! (i==elements.size()-1))
                result.append('\n');
        }
        return result.toString();
    }

}
 