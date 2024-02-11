
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mohamed
 */
public class StorageFacility {

    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        storage.putIfAbsent(unit, new ArrayList<String>());
        ArrayList<String> items = this.storage.get(unit);
        items.add(item);

    }

    public ArrayList<String> contents(String storageUnit) {
        return storage.getOrDefault(storageUnit, new ArrayList<>());

    }

    public void remove(String storageUnit, String item) {
      ArrayList <String> items =  storage.getOrDefault(storageUnit, new ArrayList<>());
      items.remove(item);
      if(items.isEmpty()){
      storage.remove(storageUnit);
      }
        
    }
    public ArrayList<String> storageUnits()
    {
        ArrayList<String> storageUnits=new ArrayList<>();
        for (String s : storage.keySet())
            storageUnits.add(s);
        
    return storageUnits;
    }

}
