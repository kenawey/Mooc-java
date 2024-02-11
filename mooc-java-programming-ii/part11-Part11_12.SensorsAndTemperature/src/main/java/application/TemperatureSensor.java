/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Mohamed
 */
public class TemperatureSensor implements Sensor{
private boolean status;

    public TemperatureSensor() {
        this.status=false;
    }

    
    @Override
    public boolean isOn() {
        return this.status;
    }

    @Override
    public void setOn() {
        this.status=true;
    }

    @Override
    public void setOff() {
        this.status=false;
    }

    @Override
    public int read() {
       // return new Random(-30).nextInt(30);
       if(!isOn()){
       throw new IllegalStateException();
       }
       int max=30;
       int min =-30;
        int randomNum = (int)(Math.random() * (max - min + 1)) + min;
        return randomNum;
    }
    
}
