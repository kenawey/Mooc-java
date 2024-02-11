/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        //super.setBalance(initialBalance);
        super.addToWarehouse(initialBalance);
        changeHistory = new ChangeHistory();
        changeHistory.add(initialBalance);

    }

    public String history() {
        return changeHistory.toString();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        changeHistory.add(this.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double result = super.takeFromWarehouse(amount);
        changeHistory.add(getBalance());
        return result;

    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + changeHistory.toString());
        System.out.println("Largest amount of product: " + changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + changeHistory.minValue());
        System.out.println("Average: " + changeHistory.average());

    }
}
