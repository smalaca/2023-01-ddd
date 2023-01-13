package com.smalaca.salesproduct.command.domain.cart;

public class CartItem {
    private final String productCode;
    private final Amount amount;

    private CartItem(String productCode, Amount amount) {
        this.productCode = productCode;
        this.amount = amount;
    }


    public static CartItem create(String productCode, Integer amount) {
        return new CartItem(productCode, Amount.create(amount));
    }
}
