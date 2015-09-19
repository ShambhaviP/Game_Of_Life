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
    public void shouldReturnSymbolOfDeadCellIfThereIsLessThanFourCellsInGrid() {
        BlockGrid blockGrid = new BlockGrid();
        Cell cell1 = new Cell("alive");
        ArrayList<String> rowOfCells1 = new ArrayList<>();
        rowOfCells1.add(cell1.stateSymbol());
        ArrayList<ArrayList<String>> grid = new ArrayList<>();
        grid.add(rowOfCells1);

        assertEquals("-", blockGrid.transformStateOfCell(grid));
    }

    @Test
    public void shouldReturnXForTheFirstLiveCellOfATwoByTwoGridHavingAllLiveCellsInItsSurrounding() {
        BlockGrid blockGrid = new BlockGrid();
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

        assertEquals("X", blockGrid.transformStateOfCell(grid));
    }
}