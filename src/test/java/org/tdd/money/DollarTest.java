package org.tdd.money;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DollarTest {
    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertThat(five.times(2)).isEqualTo(Money.dollar(10));
        assertThat(five.times(3)).isEqualTo(Money.dollar(15));
    }

    @Test
    public void testEquality() {
        assertThat(Money.dollar(5).equals(Money.dollar(5))).isTrue();
        assertThat(Money.dollar(5).equals(Money.dollar(6))).isFalse();
        assertThat(Money.franc(5).equals(Money.dollar(5))).isFalse();
    }

    @Test
    public void testFrancMultiplication() {
        Money five = Money.franc(5);
        assertThat(five.times(2)).isEqualTo(Money.franc(10));
        assertThat(five.times(3)).isEqualTo(Money.franc(15));
    }

    @Test
    public void testCurrency() {
        assertThat(Money.dollar(1).currency()).isEqualTo("USD");
        assertThat(Money.franc(1).currency()).isEqualTo("CHF");
    }

    @Test
    public void testSimpleAddition() {
        Money sum = Money.dollar(5).plus(Money.dollar(5));
        assertThat(sum).isEqualTo(Money.dollar(10));
    }

}
