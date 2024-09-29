package geometry2d;

import exceptions.FigureCreationException;


public class Rectangle implements Figure {
    private final double a;
    private final double b;

    public Rectangle(double weight, double height) {
        try {
            if ((height <= 0) || (weight <= 0)) throw new FigureCreationException("\nHeight and weight must be positive!!!");
        } catch (FigureCreationException ex) {
            System.out.println(ex.getMessage());
        }
        a = weight;
        b = height;
    }

    @Override
    public double calcArea() {
        return a*b;
    }

    public String RectangleToString() {
        return "Rectangle has width " + a + " and height " + b;
    }
}
