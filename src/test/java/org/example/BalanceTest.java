package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalanceTest {

    @Test
    void result() {
        Balance balance = new Balance(2, 4);
        assertEquals("R", balance.result());

        balance.left = 6;
        assertEquals("L", balance.result());

        balance.right = 6;
        assertEquals("=", balance.result());
    }

    @Test
    void addLeft() {
        Balance balance = new Balance(1, 1);
        balance.addLeft(4);

        assertEquals(5, balance.left);
    }

    @Test
    void addRight() {
        Balance balance = new Balance(1, 1);
        balance.addRight(4);

        assertEquals(5, balance.right);
    }
}