package com.example.tdd;

public class Money {
    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar (int amount) {
        return new Money(amount, "USD");
    }

    static Money franc (int amount) {
        return new Money(amount, "CHW");
    }


    public boolean equals(Object o) {
        //amount 값이 같으면 같은 걸로 간주
        Money money = (Money) o;
        return getClass().equals(money.getClass()) && this.amount == money.amount ;
    }

    public Money times(int multiplier) {
        return new Money(amount*multiplier, currency);
    }
    // 통화 기호를 리턴
    String currency() {
        return  currency;
    }

    public Money plus (Money money){
        return new Money(amount + money.amount, currency);
    }
}
