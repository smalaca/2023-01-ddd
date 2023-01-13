/* @(#) $$Id$$
 *
 * Copyright (c) 2000-2023 Comarch SA All Rights Reserved. Any usage,
 * duplication or redistribution of this software is allowed only according to
 * separate agreement prepared in written between Comarch and authorized party.
 */
package com.smalaca.salesproduct.command.domain.offer;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;

/**
 * @author Kamil Fiutek
 */
@AllArgsConstructor
class Price {

    static final Price ZERO = new Price(BigDecimal.ZERO);

    private final BigDecimal value;

    public Price multiply(Integer multiplier) {
        return new Price(value.multiply(BigDecimal.valueOf(multiplier)));
    }

    public Price add(Price price) {
        return new Price(value.add(price.value));
    }
}
