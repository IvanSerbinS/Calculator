package com.it_academy.calculator;

public class Calculator {

    public static double calculate(double a, char operation, double b)
            throws UnsupportedOperationException, ArithmeticException {
        switch (operation) {
            case ('+') -> {
                return MathOperation.add(a, b);
            }
            case ('-') -> {
                return MathOperation.subtract(a, b);
            }
            case ('*') -> {
                return MathOperation.multiply(a, b);
            }
            case ('/') -> {
                try {
                    return MathOperation.divide(a, b);
                } catch (ArithmeticException e) {//Catch division by 0. Enter new divider
                    throw new ArithmeticException(e.getMessage());
                }
            }
            default -> throw new UnsupportedOperationException("UnsupportedOperationException");
        }
    }
}
