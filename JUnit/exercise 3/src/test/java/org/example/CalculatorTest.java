package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(30, calculator.add(20, 10));
    }

    @Test
    public void testSubtraction() {
        assertEquals(15, calculator.subtract(20, 5));
    }

    @Test
    public void testMultiplication() {
        assertEquals(30, calculator.multiply(5, 6));
    }

    @Test
    public void testDivision() {
        assertEquals(4, calculator.divide(20, 5));
    }
}