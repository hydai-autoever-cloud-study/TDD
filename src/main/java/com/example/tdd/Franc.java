package com.example.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Franc extends Money {

    public Franc (int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount*multiplier);
    }
    public boolean equals(Object o) {
        return this.amount == ((Franc) o).amount;
    }
}
