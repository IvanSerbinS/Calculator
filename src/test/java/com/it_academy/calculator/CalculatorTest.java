package com.it_academy.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @DisplayName("Add, expected 1")
    @Test
    public void testAdd() {
        assertEquals(1,
                Calculator.add(-4, 5));
    }

    @DisplayName("Subtract, expected 6")
    @Test
    public void testSubtract() {
        assertEquals(6,
                Calculator.subtract(10,4));
    }

    @DisplayName("Multiply, expected -1")
    @Test
    public void testMultiply() {
        assertEquals(-1,
                Calculator.multiply(0.5,-2));
    }

    @DisplayName("Divide, expected -4")
    @Test
    public void testDivide() {
        assertEquals(-4,
                Calculator.divide(2,-0.5));
    }
}