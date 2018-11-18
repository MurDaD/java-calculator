package com.murdad.calculator;

import com.murdad.calculator.enums.Operations;
import com.murdad.calculator.operations.*;

import java.math.BigDecimal;
import java.util.InputMismatchException;

public class Calculator {

    public static String calculate(int number1, int number2, int operation) {
        Operation o = chooseOperation(operation);
        return o.calculate(
                numberToBigDecimal(number1),
                numberToBigDecimal(number2)
        )
                .stripTrailingZeros()
                .toPlainString();
    }

    public static String calculate(double number1, double number2, int operation) {
        Operation o = chooseOperation(operation);
        return o.calculate(
                numberToBigDecimal(number1),
                numberToBigDecimal(number2)
        )
                .stripTrailingZeros()
                .toPlainString();
    }

    private static Operation chooseOperation(int operation) {
        switch (operation) {
            case Operations.ADDITION:
                return new Addition();
            case Operations.SUBTRACTION:
                return new Subtraction();
            case Operations.MULTIPLICATION:
                return new Multiplication();
            case Operations.DIVISION:
                return new Division();
            default:
                throw new InputMismatchException();
        }
    }

    private static BigDecimal numberToBigDecimal(double n) {
        return new BigDecimal(Double.toString(n));
    }

    private static BigDecimal numberToBigDecimal(int n) {
        return new BigDecimal(Integer.toString(n));
    }
}
