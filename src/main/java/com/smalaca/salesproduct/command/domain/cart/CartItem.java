package com.smalaca.salesproduct.command.domain.cart;

import java.util.Objects;
import com.smalaca.salesproduct.command.domain.amount.Amount;

class CartItem {
    private final String productCode;
    private Amount amount;

    CartItem(String productCode, Amount amount) {
        this.productCode = productCode;
        this.amount = amount;
    }

    boolean isFor(String productCode) {
        return Objects.equals(this.productCode, productCode);
    }

    void add(Amount amount) {
        this.amount = this.amount.add(amount);
    }
}
