package geometry3d;

import geometry2d.Circle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    Cylinder cylinder;

    @BeforeEach
    void setUp() {
        cylinder = new Cylinder(5, 10);
    }

    @Test
    void getHeight() {
        assertEquals(10, cylinder.getHeight());
    }

    @Test
    void setHeight() {
        cylinder.setHeight(2);

        assertEquals(2, cylinder.getHeight());
    }

    @Test
    void getCircle() {
        assertEquals(new Circle(5).getRadius(), cylinder.getCircle().getRadius());
    }

    @Test
    void setCircle() {
        Circle circle = new Circle(7);
        cylinder.setCircle(circle);

        assertEquals(circle, cylinder.getCircle());
    }

    @Test
    void volume() {
        assertEquals(785.3981633974483, cylinder.volume());
    }
}