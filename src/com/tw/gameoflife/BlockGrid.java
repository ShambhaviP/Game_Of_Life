//handles a block pattern of cells
package com.tw.gameoflife;

import java.util.ArrayList;

public class BlockGrid {

    private ArrayList<ArrayList<String>> twoDimensionalGrid;
    private ArrayList<String> rowOfCells;

    public BlockGrid() {
        twoDimensionalGrid = new ArrayList<>();
        rowOfCells = new ArrayList<>();
    }

    public ArrayList<String> fillEachRowOfCells(Cell cell) {

        rowOfCells.add(cell.stateSymbol());
        return rowOfCells;
    }
}