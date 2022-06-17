package com.it_academy.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @DisplayName("Addition, expected -1")
    @Test
    void testCalculateAddition(){
        assertEquals(-1, Calculator.calculate(106.2,'+',-107.2),"Addition in calculate method works wrong");
    }

    @DisplayName("Subtraction, expected -213.4")
    @Test
    void testCalculateSubtraction(){
        assertEquals(-213.4, Calculator.calculate(-106.2,'-',107.2),"Subtraction in calculate method works wrong");
    }

    @DisplayName("Multiplication, expected 0")
    @Test
    void testCalculateMultiplicationOfZeros(){
        assertEquals(0, Calculator.calculate(0,'*',0), "Multiplication in calculate method works wrong");
    }

    @DisplayName("Division, expected 70.28724832214765")
    @Test
    void testCalculateDivision(){
        assertEquals(70.28724832214765, Calculator.calculate(52.364,'/',0.745), "Division in calculate method works wrong");
    }

    @DisplayName("Division by Zero, expected ArithmeticException")
    @Test
    void testCalculateDivisionByZeroException(){
        ArithmeticException thrown = assertThrows(ArithmeticException.class,() ->
                        Calculator.calculate(5,'/',0)
                , "ArithmeticException was expected");
        assertEquals("Division by zero is not allowed.", thrown.getMessage(),"ArithmeticException in time of dividing by zero in calculate method wasn't thrown");
    }

    @DisplayName("Unsupported operation, expected UnsupportedOperationException")
    @Test
    void testCalculate(){
        UnsupportedOperationException thrown = assertThrows(UnsupportedOperationException.class,() ->
                        Calculator.calculate(5,'j',5)
                , "UnsupportedOperationException was expected");
        assertEquals("UnsupportedOperationException", thrown.getMessage(), "UnsupportedOperationException in calculate method wasn't thrown when getting wrong operation character");
    }
}
