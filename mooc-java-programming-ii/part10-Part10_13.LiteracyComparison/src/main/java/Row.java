/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed
 */
public class Row {
    private String name,gender;
    private int year;
    private double rate;

    public Row(String name, String gender, int year, double rate) {
        this.name = name;
        this.gender = gender;
        this.year = year;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getYear() {
        return year;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return  name + " ("+year+"), " + gender +  ", " + rate ;
    }

  
    
    
}
