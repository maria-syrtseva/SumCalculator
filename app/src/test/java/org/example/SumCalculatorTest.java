package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
     private SumCalculator calculator;

     @BeforeEach
    void setUp() {
         calculator = new SumCalculator();
     }

     @Test
    void testSumWithOne() {
         assertEquals(1, calculator.sum(1));
     }

     @Test
    void testSumWithThree() {
         assertEquals(6, calculator.sum(3));
     }

     @Test
    void testSumWithZeroThrowsException() {
         assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
     }
}