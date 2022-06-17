package com.it_academy.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationTest {

    @DisplayName("Add, expected 1")
    @Test
    void testAdd() {
        assertEquals(1,
                MathOperation.add(-4, 5), "Add method doesn't work as expected");
    }

    @DisplayName("Subtract, expected 6")
    @Test
    void testSubtract() {
        assertEquals(6,
                MathOperation.subtract(10, 4), "Subtract method doesn't work as expected");
    }

    @DisplayName("Multiply, expected -1")
    @Test
    void testMultiply() {
        assertEquals(-1,
                MathOperation.multiply(0.5, -2), "Multiply method doesn't work as expected");
    }

    @DisplayName("Divide, expected -4")
    @Test
    void testDivide() {
        assertEquals(-4,
                MathOperation.divide(2, -0.5), "Divide method doesn't work as expected");
    }

    @DisplayName("Divide by Zero, expected ArithmeticException ")
    @Test
    void testExceptionDivideByZero() {
        ArithmeticException thrown = assertThrows(ArithmeticException.class, () -> MathOperation.divide(5, 0)
                , "ArithmeticException was expected");
        assertEquals("Division by zero is not allowed.", thrown.getMessage(),"ArithmeticException wasn't thrown in divide method when dividing by zero wasn't thrown");
    }
}