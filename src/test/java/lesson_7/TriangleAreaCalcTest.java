package lesson_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleAreaCalcTest {

    final public TriangleAreaCalc operation = new TriangleAreaCalc();

    @Test
    void calculateArea() {
        assertEquals(25.0,
                operation.calculateArea(10, 5));
    }

    @Test
    void calculateAreaWithDecimalValues() {
        assertEquals(7.5,
                operation.calculateArea(5, 3),
                0.001);
    }

    @Test
    void negativeBase() {
        assertThrows(
                IllegalArgumentException.class,
                () -> operation.calculateArea(-5, 4)
        );
    }
}