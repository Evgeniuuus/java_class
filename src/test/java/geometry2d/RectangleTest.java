package geometry2d;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private Rectangle rectangle;

    @Test
    void calcArea() {
        rectangle = new Rectangle(2,5);
        assertEquals(10, rectangle.calcArea());
    }

    @Test
    void rectangleToString() {
        rectangle = new Rectangle(2,5);
        assertEquals("Rectangle has width 2.0 and height 5.0", rectangle.RectangleToString());
    }
}