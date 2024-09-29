package geometry2d;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    private Circle circle;

    @Test
    void calcArea() {
        circle = new Circle(2);
        assertEquals(12.56, circle.calcArea());
    }

    @Test
    void circleToString() {
        circle = new Circle(2);
        assertEquals("Circle has radius 2.0", circle.CircleToString());
    }
}