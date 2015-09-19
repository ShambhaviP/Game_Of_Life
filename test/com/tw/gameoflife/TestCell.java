package com.tw.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCell {

    @Test
    public void shouldUseXToRepresentTheStateOfACell() {
        Cell cell = new Cell("alive");

        assertEquals("X", cell.stateSymbol());
    }

    @Test
    public void shouldReturnMinusSymbolToRepresentACellWithDeadState() {
        Cell cell = new Cell("dead");

        assertEquals("-", cell.stateSymbol());
    }
}