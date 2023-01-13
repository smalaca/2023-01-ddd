package com.smalaca.salesproduct.command.domain.offer;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Discount {

    private final BigDecimal value;

    Discount create(final BigDecimal value) {
//        if (value.compareTo(BigDecimal.ZERO) < 0) {
//            throw new AmountException(value);
//        }
        return new Discount(value);
    }
}
