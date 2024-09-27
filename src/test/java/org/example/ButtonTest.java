package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ButtonTest {

    @Test
    void click() {
        Button button = new Button();

        button.click();
        button.click();
        button.click();

        assertEquals(3, button.getCountClick());
    }
}