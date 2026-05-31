package lesson_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberCompTest {

    private final NumberComp operation = new NumberComp();

    @Test
    void firstNumberGreater() {
        assertEquals(1,
                operation.compare(10, 5));
    }

    @Test
    void firstNumberLess() {
        assertEquals(-1,
                operation.compare(5, 10));
    }

    @Test
    void numbersAreEqual() {
        assertEquals(0,
                operation.compare(10, 10));
    }
}