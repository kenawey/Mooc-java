
import java.util.HashMap;
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mohamed
 */
public class VehicleRegistry {

private HashMap<  LicensePlate, String> registry;

    public VehicleRegistry() {
        registry=new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if(!registry.containsKey(licensePlate)){
        registry.put(licensePlate, owner);
        return true;
        }
        return false;

    }

    public String get(LicensePlate licensePlate) {
     return registry.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {

        for (LicensePlate l : registry.keySet()) {
            if (l.equals(licensePlate)) {
                registry.remove(l);
                return true;
            }   
        }
        return false;
    }

    public void printLicensePlates() {

        for (LicensePlate l : registry.keySet()) {
            System.out.println(l);
        }

    }

    public void printOwners() {
      HashSet<String> a = new HashSet<String>(); 
        
        // Adding all elements to List  
        a.addAll(registry.values()); 
        for (String s : a) {
            System.out.println(s);

        }

    }
}
