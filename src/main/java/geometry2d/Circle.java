package geometry2d;

import exceptions.NoDataException;
import exceptions.ZeroValueException;

public class Circle implements Figure{
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws ZeroValueException {
        if (radius == 0) {
            throw new ZeroValueException("Radius cannot be zero");
        }

        this.radius = radius;
    }

    public Circle(double radius) {
        if (radius == 0) {
            throw new ZeroValueException("Radius cannot be zero");
        }

        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * (radius * radius);
    }

    @Override
    public String toString() {
        if (radius == 0) {
            throw new NoDataException("No data to display");
        }

        return "Circle with Radius = " + radius;
    }
}
