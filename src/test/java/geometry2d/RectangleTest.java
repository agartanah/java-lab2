package geometry2d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(3, 6);
    }

    @Test
    void getWidth() {
        assertEquals(3, rectangle.getWidth());
    }

    @Test
    void setWidth() {
        rectangle.setWidth(5);

        assertEquals(5, rectangle.getWidth());
    }

    @Test
    void getHeight() {
        assertEquals(6, rectangle.getHeight());
    }

    @Test
    void setHeight() {
        rectangle.setHeight(8);

        assertEquals(8, rectangle.getHeight());
    }

    @Test
    void area() {
        assertEquals(18, rectangle.area());
    }

    @Test
    void testToString() {
        String recString = "Rectangle with Width = " + rectangle.getWidth() + " and Height = " + rectangle.getHeight();

        assertEquals(recString, rectangle.toString());
    }
}