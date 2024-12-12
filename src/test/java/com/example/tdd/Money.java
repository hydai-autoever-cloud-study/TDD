package com.example.tdd;

public abstract class Money {
    protected int amount;
    protected String currency;

    static Dollar dollar (int amount) {
        return new Dollar(amount, "USD");
    }

    static Franc franc (int amount) {
        return new Franc(amount, "CHW");
    }

    abstract Money times(int multiplier);

    public boolean equals(Object o) {
        //amount 값이 같으면 같은 걸로 간주
        Money money = (Money) o;
        return getClass().equals(money.getClass()) && this.amount == money.amount ;
    }
    // 통화 기호를 리턴
    String currency() {
        return  currency;
    }
}
