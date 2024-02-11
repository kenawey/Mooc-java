/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed Mostafa
 */
public class Gauge {

    private int value;

    public Gauge() {
        this.value = 0;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
         //this.value= this.value<5 ? this.value++:value; // do not know why this line do not work as for real if.
         if (this.value<5 ){
             this.value++;
         }
    }

    public void decrease() {
        this.value = (this.value > 0) ? this.value-- : this.value;
    }

    public boolean full() {
        return this.value == 5;
    }
}
