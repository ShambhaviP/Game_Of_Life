package com.tw.gameoflife;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestBlockGrid {

    @Test
    public void shouldReturnARowOfCells() {
        BlockGrid blockGrid = new BlockGrid();
        Cell cell = new Cell("alive");
        ArrayList<String> rowOfCells = new ArrayList<>();
        rowOfCells.add("X");

        assertEquals(rowOfCells, blockGrid.fillEachRowOfCells(cell));
    }

    @Test
    public void shouldReturnAGridOfCells() {
        BlockGrid blockGrid = new BlockGrid();
        ArrayList<String> rowOfCells = new ArrayList<>();
        rowOfCells.add("X");
        rowOfCells.add("-");
        ArrayList<ArrayList<String>> grid = new ArrayList<>();
        grid.add(rowOfCells);

        assertEquals(grid, blockGrid.fillGridWithCellRows(rowOfCells));
    }

    @Test
    public void shouldReturnSymbolOfDeadCellIfALiveCellHasFewerThanTwoLiveCells() {
        BlockGrid blockGrid = new BlockGrid();
        ArrayList<String> rowOfCells = new ArrayList<>();
        rowOfCells.add("X");
        rowOfCells.add("-");
        ArrayList<ArrayList<String>> grid = new ArrayList<>();
        grid.add(rowOfCells);

        assertEquals("-", blockGrid.transformStateOfCell(grid));
    }
}