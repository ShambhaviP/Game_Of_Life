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
        if (twoDimensionalGrid.size() > 1) {
            for (int row = 0; row < twoDimensionalGrid.size(); row++) {
                for (int column = 0; column < twoDimensionalGrid.get(row).size(); column++) {
                    if (twoDimensionalGrid.get(row).get(column + 1).equals("X") && twoDimensionalGrid.get(row + 1).get(column).equals("X") && twoDimensionalGrid.get(row + 1).get(column + 1).equals("X")) {
                        return "X";
                    }
                }
            }
        }

        return "-";
    }
}