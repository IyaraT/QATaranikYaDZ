package lesson_7;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticOpTest {

    private ArithmeticOp operations;

    @BeforeEach
    void setUp() {
        operations = new ArithmeticOp();
    }

    @Test
    void addition() {
        assertEquals(15, operations.add(10, 5));
    }

    @Test
    void subtraction() {
        assertEquals(5,
                operations.subtract(10, 5));
    }

    @Test
    void multiplication() {
        assertEquals(50,
                operations.multiply(10, 5));
    }

    @Test
    void division() {
        assertEquals(2.0,
                operations.divide(10, 5));
    }

    @Test
    void divisionByZero() {
        assertThrows(
                ArithmeticException.class,
                () -> operations.divide(10, 0)
        );
    }
}