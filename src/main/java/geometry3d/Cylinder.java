package geometry3d;

import exceptions.ZeroValueException;
import geometry2d.Circle;
import geometry2d.Figure;

public class Cylinder {
    private Figure circle;
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height == 0) {
            throw new ZeroValueException("Height cannot be zero");
        }

        this.height = height;
    }

    public Circle getCircle() {
        return (Circle) circle;
    }

    public void setCircle(Figure circle) {
        if (circle == null) {
            throw new ZeroValueException("Circle cannot be null");
        }

        this.circle = circle;
    }

    public Cylinder(double radius, double height) {
        if (radius == 0 || height == 0) {
            throw new ZeroValueException("Radius and Height cannot be zero");
        }

        this.circle = new Circle(radius);
        this.height = height;
    }

    public double volume() {
        return circle.area() * height;
    }
}
