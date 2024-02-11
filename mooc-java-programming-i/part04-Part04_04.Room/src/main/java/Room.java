/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed Mostafa
 */
public class Room {

    private int seats;
    private String code;

    public Room(String classCode, int numberOfSeats) {
        this.code =classCode ;
        this.seats = numberOfSeats;
    }

}
