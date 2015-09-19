//creates individual cells of the square grid
package com.tw.gameoflife;

public class Cell {

    private String state;

    public Cell(String state) {
        this.state = state;
    }

    public String stateSymbol() {
        if (state.equals("dead")) {
            return "-";
        } else {
            return "X";
        }
    }
}