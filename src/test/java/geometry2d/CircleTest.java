package geometry2d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle circle;

    @BeforeEach
    void setUp() {
        circle = new Circle(4);
    }

    @Test
    void getRadius() {
        assertEquals(4, circle.getRadius());
    }

    @Test
    void setRadius() {
        circle.setRadius(5);

        assertEquals(5, circle.getRadius());
    }

    @Test
    void area() {
        assertEquals(50.26548245743669, circle.area());
    }

    @Test
    void testToString() {
        String cirString = "Circle with Radius = " + circle.radius;

        assertEquals(cirString, circle.toString());
    }
}