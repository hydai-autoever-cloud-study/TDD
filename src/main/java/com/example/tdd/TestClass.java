package com.example.tdd;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestClass {
    @Test
    public void testMultiplication() {
//        Dollar five = new Dollar(5);
//        Dollar dollar = five.times(2);
//        assertEquals(10, dollar.amount);
//
//        dollar = five.times(2);
//        assertEquals(10, dollar.amount);
    }

    @Test
    public void testEquality () {
        assertTrue(new Franc(5).equals(new Franc(5)));
    }
}