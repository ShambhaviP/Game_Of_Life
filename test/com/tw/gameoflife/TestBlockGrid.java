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
}