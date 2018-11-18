package com.murdad.calculator;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeAll
    static void beforeClass() {
        System.out.println("Before CalculatorTest.class");
    }

    @AfterAll
    static void afterClass() {
        System.out.println("After CalculatorTest.class");
    }

    @Test
    void addition() {
        assertEquals("15", Calculator.calculate(10, 5, '+'));
        assertEquals("3.444", Calculator.calculate(1.123, 2.321, '+'));
        assertEquals("6", Calculator.calculate(2.5, 3.5, '+'));
    }

    @Test
    void subtraction() {
        assertEquals("15", Calculator.calculate(20, 5, '-'));
        assertEquals("2.4", Calculator.calculate(3.6, 1.2, '-'));
        assertEquals("1", Calculator.calculate(1.5, 0.5, '-'));
    }

    @Test
    void multiplication() {
        assertEquals("30", Calculator.calculate(3, 10, '*'));
        assertEquals("22.94", Calculator.calculate(12.4, 1.85, '*'));
        assertEquals("255", Calculator.calculate(2.55, 100, '*'));
    }

    @Test
    void division() {
        assertEquals("3", Calculator.calculate(9, 3, '/'));
        assertEquals("2.5", Calculator.calculate(5.25, 2.1, '/'));
        assertEquals("10", Calculator.calculate(33, 3.3, '/'));
    }

    @Test
    void divisionError() {
        assertThrows(ArithmeticException.class, () -> {
            Calculator.calculate(33, 0, '/');
        });
    }

}