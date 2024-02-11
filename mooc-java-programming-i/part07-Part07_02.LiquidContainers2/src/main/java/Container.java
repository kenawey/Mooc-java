/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed Mostafa
 */
public class Container {

    private int lequid;

    public Container() {
        this.lequid = 0;
    }

    public int contains() {
        return lequid;
    }

    public void add(int amount) {

        if (amount > 0) {

            int avaliable = 100 - lequid;
            if (amount < avaliable) {
                lequid += amount;
            } else {
                lequid = 100;
            }

        }

    }

    public void remove(int amount) {

        if (amount > 0) {

            lequid -= amount > lequid || amount > 100 ? lequid : amount;
//                            firstContainer = firstContainer - removeAmount <= 0 ? 0 : firstContainer - removeAmount;

        }
    }

    @Override
    public String toString() {
        return this.lequid + "/100";
    }

}
