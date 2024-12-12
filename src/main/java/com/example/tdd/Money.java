package com.example.tdd;

public class Money {
    protected int amount;

    public boolean equals(Object o) {
        //amount 값이 같으면 같은 걸로 간주
        return this.amount == ((Money) o).amount;
    }
}
