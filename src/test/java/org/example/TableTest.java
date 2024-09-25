package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {
    static Table table = new Table(4, 4);

    @BeforeAll
    static void fillTable() {
        int number = 1;

        for (int indexRow = 0; indexRow < table.rows(); ++indexRow) {
            for (int indexColumn = 0; indexColumn < table.cols(); ++indexColumn) {
                table.setValue(indexRow, indexColumn, number);

                ++number;
            }
        }
    }

    @Test
    void getValue() {
        assertEquals(5, table.getValue(1, 0));
    }

    @Test
    void setValue() {
        table.setValue(3, 2, 15);

        assertEquals(15, table.getValue(3, 2));
    }

    @Test
    void rows() {
        assertEquals(4, table.rows());
    }

    @Test
    void cols() {
        assertEquals(4, table.cols());
    }

    @Test
    void testToString() {
        String result = "1\t2\t3\t4\t\n5\t6\t7\t8\t\n9\t10\t11\t12\t\n13\t14\t15\t16\t\n";

        assertEquals(result, table.toString());
    }

    @Test
    void average() {
        double avg = 0;

        for (int index = 1; index <= 16; ++index) {
            avg += index;
        }

        avg /= 16;

        assertEquals(avg, table.average());
    }
}