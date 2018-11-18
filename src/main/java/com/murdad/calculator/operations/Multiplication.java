package com.murdad.calculator.operations;

import java.math.BigDecimal;

public class Multiplication implements Operation {
    @Override
    public BigDecimal calculate(BigDecimal number1, BigDecimal number2) {
        return number1.multiply(number2);
    }
}
