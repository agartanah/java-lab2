package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BellTest {

    @Test
    void sound() {
        Bell bell = new Bell();

        assertEquals("ding", bell.sound());
        assertEquals("dong", bell.sound());
        assertEquals("ding", bell.sound());
        assertEquals("dong", bell.sound());
        assertEquals("ding", bell.sound());
    }
}