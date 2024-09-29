package geometry3d;

import geometry2d.Figure;
import exceptions.InvalidDimensionException;

public class Cylinder {
    private final Figure foot;
    private final double height;

    public Cylinder(Figure foot, double height) {
        try {
            if (height <= 0) throw new InvalidDimensionException("\nHeight must be positive!!!");
        } catch (InvalidDimensionException ex) {
            System.out.println(ex.getMessage());
        }
        this.foot = foot;
        this.height = height;
    }

    public double calcVolume() {
        return foot.calcArea() * height;
    }
}
