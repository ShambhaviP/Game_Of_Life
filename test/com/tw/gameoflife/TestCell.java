package com.tw.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCell {

    @Test
    public void shouldUseXToRepresentAnAliveCell() {
        Cell cell = new Cell("alive");

        assertEquals("X", cell.stateSymbol());
    }
}