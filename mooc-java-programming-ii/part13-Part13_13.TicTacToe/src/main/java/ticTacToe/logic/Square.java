/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe.logic;

import static ticTacToe.logic.State.UNMARKED;

/**
 *
 * @author Mohamed
 */
public class Square {

    private State squareState;

    public Square() {
        this.squareState = UNMARKED;
    }

    public State getSquareState() {
        return squareState;
    }

    public void setSquareState(State squareState) {
        this.squareState = squareState;
    }    
}

