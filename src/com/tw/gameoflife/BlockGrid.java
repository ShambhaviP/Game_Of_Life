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

    public ArrayList<ArrayList<String>> fillGridWithCellRows(ArrayList<String> rowOfCells) {
        twoDimensionalGrid.add(rowOfCells);
        return twoDimensionalGrid;
    }

    public String transformStateOfCell(ArrayList<ArrayList<String>> twoDimensionalGrid) {
        return "-";
    }

    public int numberOfNeighbours(ArrayList<ArrayList<String>> twoDimensionalGrid) {
        return 2;
    }
}