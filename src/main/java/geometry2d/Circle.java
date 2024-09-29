package geometry2d;

import exceptions.FigureCreationException;

public class Circle implements Figure {
    private final double R;

    public Circle(double radius) {
        try {
            if (radius <= 0) throw new FigureCreationException("\nRadius must be positive!!!");
        } catch (FigureCreationException ex) {
            System.out.println(ex.getMessage());
        }
        R = radius;
    }

    @Override
    public double calcArea() {
        double PI = 3.14;
        return PI * R * R;
    }

    public String CircleToString() {
        return "Circle has radius " + R;
    }
}
