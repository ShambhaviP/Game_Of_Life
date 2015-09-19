//launches the application,sets up and displays the grid
package com.tw.gameoflife;

import java.util.ArrayList;

public class GameOfLifeApplication {

    public static void main(String args[]) {
        Cell cell1 = new Cell("alive");
        Cell cell2 = new Cell("alive");
        Cell cell3 = new Cell("alive");
        Cell cell4 = new Cell("alive");
        ArrayList<String> rowOfCells1 = new ArrayList<>();
        rowOfCells1.add(cell1.stateSymbol());
        rowOfCells1.add(cell2.stateSymbol());
        ArrayList<String> rowOfCells2 = new ArrayList<>();
        rowOfCells2.add(cell3.stateSymbol());
        rowOfCells2.add(cell4.stateSymbol());
        ArrayList<ArrayList<String>> grid = new ArrayList<>();
        grid.add(rowOfCells1);
        grid.add(rowOfCells2);
        System.out.print(grid);
    }
}