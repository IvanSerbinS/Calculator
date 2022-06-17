package com.it_academy.calculator;

public class InputOperation {
    //Enter operation
    public static char enterOperation() {
        do {
            System.out.print("Enter operation (+,-,*,/): ");
            String str = CalculatorMain.scan.nextLine();
            if (str.length() == 1) {
                switch (str.charAt(0)) {
                    case '+', '-', '*', '/' -> {
                        return str.charAt(0);
                    }
                    default -> System.out.println("Unknown operation: \"" + str + "\"");
                }
            } else System.out.println("Wrong operation. Enter one symbol.");
        } while (true);
    }
}

