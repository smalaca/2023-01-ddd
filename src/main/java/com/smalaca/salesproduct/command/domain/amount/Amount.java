package com.smalaca.salesproduct.command.domain.amount;

public class Amount {
    private final Integer value;

    private Amount(Integer value) {
        this.value = value;
    }

    public static Amount create(Integer amount) {
        if (amount < 1) {
            throw new AmountException(amount);
        }
        return new Amount(amount);
    }

    public Amount add(Amount amount) {
        return Amount.create(value + amount.value);
    }
}
