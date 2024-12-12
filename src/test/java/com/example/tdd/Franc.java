package com.example.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Franc extends Money {

    public Franc (int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Franc(amount*multiplier);
    }


    public String currency() {
        return "CNF";
    }
}
