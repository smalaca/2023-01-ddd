package com.smalaca.salesproduct.command.domain.cart;

public class FooBar {
    private final String productCode;
    private final Amount amount;

    private FooBar(String productCode, Amount amount) {
        this.productCode = productCode;
        this.amount = amount;
    }

    public static FooBar create(String productCode, Integer amount) {
        return new FooBar(productCode, Amount.create(amount));
    }
}
