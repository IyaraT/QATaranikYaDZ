package lesson_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialCalcTest {

    private final FactorialCalc operation = new FactorialCalc();

    @Test
    void factorialOfZero() {
        assertEquals(1, operation.factorial(0));
    }

    @Test
    void factorialOfFive() {
        assertEquals(120, operation.factorial(5));
    }

    @Test
    void factorialOfOne() {
        assertEquals(1, operation.factorial(1));
    }

    @Test
    void factorialNegativeNumber() {
        assertThrows(
                IllegalArgumentException.class,
                () -> operation.factorial(-1)
        );
    }
}