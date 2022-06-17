package com.it_academy.calculator;

import java.util.Scanner;

public class CalculatorMain {
    static Scanner scan = new Scanner(System.in);
    static double num1;
    static char operation;
    static double num2;

    public static void main(String[] args) {
        double result;
        System.out.println("Starting calculation:");
        num1 = InputDouble.enterDouble();
        operation = InputOperation.enterOperation();
        num2 = InputDouble.enterDouble();
        do {
            try {
                result = Calculator.calculate(num1, operation, num2);
                break;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage() + " Enter new divider!");
                num2 = InputDouble.enterDouble();
            }
        } while (true);
        System.out.println("Result: " + result); //Output result
    }


}

