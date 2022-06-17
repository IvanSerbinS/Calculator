package com.it_academy.calculator;

public class InputDouble {
    //Enter double number from console method
    public static double enterDouble() {
        do {
            try {
                System.out.print("Enter a number: ");
                return Double.parseDouble(CalculatorMain.scan.nextLine().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Your input is not a number! Try again!");
            }
        } while (true);
    }
}

