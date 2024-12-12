package com.example.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Franc extends Money {

    public Franc (int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money times(int multiplier) {
        return Money.franc(amount*multiplier);
    }

}
