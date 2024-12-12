package com.example.tdd;

public abstract class Money {
    protected int amount;

    static Dollar dollar (int amount) {

        return new Dollar(amount);
    }

    static Franc franc (int amount) {
        return new Franc(amount);
    }

    abstract String currency();

    abstract Money times(int multiplier);

    public boolean equals(Object o) {
        //amount 값이 같으면 같은 걸로 간주
        Money money = (Money) o;
        return getClass().equals(money.getClass()) && this.amount == money.amount ;
    }
}
