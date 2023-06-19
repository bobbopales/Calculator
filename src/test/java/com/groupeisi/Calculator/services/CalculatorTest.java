package com.groupeisi.Calculator.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class CalculatorTest {
    @Test
    public void testadd(){
        int a = 2;
        int b = 3;
        int resultatattendu = 5;
        int result;
        Calculator calculator = new Calculator();
        result = calculator.add(a,b);
        Assertions.assertEquals(resultatattendu , result);
        //Assertions.assertFalse(Optional.of(result).isEmpty());
        //Assertions.assertTrue(Optional.of(result).isEmpty());

    }
    @Test
    public void testDivision(){
        int a = 20;
        int b = 0;

    }
}
