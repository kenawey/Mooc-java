
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mohamed
 */
public class Warehouse {

   private  Map<String, Integer> products, stocks;

    public Warehouse() {
        products = new HashMap<>();
        stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        products.put(product, price);
        stocks.put(product, stock);

    }

    public int price(String product) {
        return products.getOrDefault(product, -99);

    }

    public int stock(String product) {
        return stocks.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        int stock = stock(product);
        if (stock > 0) {
            stocks.put(product, stock - 1);
            if (stock - 1 >= 0) {
                return true;
            }
        }
        return false;

    }

    public Set<String> products() {
        return products.keySet();
    }

}
