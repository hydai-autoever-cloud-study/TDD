package com.example.tdd;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestClass {
    @Test
    public void testMultiplication(){
        // dollar 라는 메서드는 실제로는 Doller 객체를 리턴하므로 five 에 들어있는 객체는 Dollar 객체
        // times 는 Money 클래스에 추상메서드로 존재하므로 문법적 에러가 없어지고
        // Dollar 에서 오버라이딩 했으므로 five 가 호출될 때는 Dollar 에 만든 메서드가 호출됨
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testFrancMultiplication(){
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    public void testEquality(){
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));
        // 서로 다른 타입의 데이터는 비교 대상이 아님
        // 에러가 발생하거나 false 가 리턴되어야 한느데 amount 값이 같다는 이유로
        // 비교가 가능하고 동일하다고 리턴됩니다.
        assertFalse(Money.dollar(5).equals(Money.franc(5)));
    }

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CNF", Money.franc(1).currency());
    }

}