package com.smalaca.salesproduct.command.domain.cart;

class Amount {
    private final Integer value;

    private Amount(Integer value) {
        this.value = value;
    }

    static Amount create(Integer amount) {
        if (amount < 1) {
            throw new AmountException(amount);
        }
        return new Amount(amount);
    }

    Amount add(Amount amount) {
        return Amount.create(value + amount.value);
    }
}
