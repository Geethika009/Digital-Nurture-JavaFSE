package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest2 {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup completed");
    }

    @After
    public void tearDown() {
        System.out.println("Resources cleaned");
    }

    @Test
    public void testAddition() {

        // Arrange
        int a = 20;
        int b = 10;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    @Test
    public void testSubtraction() {

        // Arrange
        int a = 20;
        int b = 5;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testMultiplication() {

        // Arrange
        int a = 5;
        int b = 6;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(30, result);
    }

    @Test
    public void testDivision() {

        // Arrange
        int a = 20;
        int b = 5;

        // Act
        int result = calculator.divide(a, b);

        // Assert
        assertEquals(4, result);
    }
}