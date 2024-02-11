/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed Mostafa
 */
public class Product {

    private String name;
    private int qauntity;
    private double price;

    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.qauntity = initialQuantity;
    }

    public void printProduct() {

        System.out.println(name + ", price " + price + ", " + qauntity + " pcs");
    }

}
