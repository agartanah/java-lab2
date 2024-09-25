package geometry2d;

import exceptions.NoDataException;
import exceptions.ZeroValueException;

public class Rectangle implements Figure {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width == 0) {
            throw new ZeroValueException("Width cannot be zero");
        }

        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (width == 0) {
            throw new ZeroValueException("Height cannot be zero");
        }

        this.height = height;
    }

    public Rectangle(double width, double height) {
        if (width == 0 || height == 0) {
            throw new ZeroValueException("Width or Height cannot be zero");
        }

        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public String toString() {
        if (width == 0 || height == 0) {
            throw new NoDataException("No data to display");
        }

        return "Rectangle with Width = " + width + " and Height = " + height;
    }
}
