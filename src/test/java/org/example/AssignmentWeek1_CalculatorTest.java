package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssignmentWeek1_CalculatorTest {

    @Test
    void divide() {
       double result = AssignmentWeek1_Calculator.divide(10, 2);
       assertEquals(5,result);
    }
    @Test
    void divideByZero() {
        double result = AssignmentWeek1_Calculator.divide(10, 0);
        assertEquals(5,result); //Just testing
    }
}