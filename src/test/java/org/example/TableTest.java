package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {

    private Table table;

    @Test
    void getValue() {
        table = new Table(3,3);
        table.setValue(0, 0, 1);
        table.setValue(1, 1, 2);
        table.setValue(2, 2, 3);

        assertEquals(1, table.getValue(0, 0));
        assertEquals(2, table.getValue(1, 1));
        assertEquals(3, table.getValue(2, 2));
    }

    @Test
    void rows() {
        table = new Table(3,3);
        assertEquals(3, table.rows());
    }

    @Test
    void columns() {
        table = new Table(3,3);
        assertEquals(3, table.rows());
    }


    @Test
    void tableToString() {
        table = new Table(3,3);
        table.setValue(0, 0, 1);
        table.setValue(1, 1, 2);
        table.setValue(2, 2, 3);
        assertEquals("1 0 0 \n0 2 0 \n0 0 3 \n", table.TableToString());
    }

    @Test
    void testAverage() {
        table = new Table(2,2);
        table.setValue(0, 0, 1);
        table.setValue(0, 1, 1);
        table.setValue(1, 0, 1);
        table.setValue(1, 1, 1);

        assertEquals(1, table.average());
    }
}