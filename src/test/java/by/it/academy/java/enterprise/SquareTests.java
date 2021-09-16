package by.it.academy.java.enterprise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTests {
    private Square square = new Square();

    @Test
    public void positiveSquare() {
        assertEquals(4, square.calculate(2));
        assertEquals(9, square.calculate(-3));
    }

    @Test
    public void nullCase() {
        assertEquals(0, square.calculate(null));
    }
}
