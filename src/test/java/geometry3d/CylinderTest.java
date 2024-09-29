package geometry3d;

import geometry2d.Circle;
import geometry2d.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void calcVolume() {
        Rectangle rectangle = new Rectangle(2, 5);
        Cylinder cylinder = new Cylinder(rectangle, 5);
        assertEquals(50.0, cylinder.calcVolume());
    }
}