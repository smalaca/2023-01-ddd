package com.smalaca.salesproduct.command.domain.cart;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import com.smalaca.salesproduct.command.domain.amount.Amount;

public class Cart {
    private final UUID customerId;
    private final List<CartItem> cartItems = new ArrayList<>();

    private Cart(UUID customerId) {
        this.customerId = customerId;
    }

    public void add(Map<String, Integer> items) {
        items.forEach((productCode, amount) -> {
            add(productCode, Amount.create(amount));
        });
    }

    private void add(String productCode, Amount amount) {
        Optional<CartItem> found = findFor(productCode);

        if (found.isPresent()) {
            found.get().add(amount);
        } else {
            cartItems.add(new CartItem(productCode, amount));
        }
    }

    private Optional<CartItem> findFor(String productCode) {
        return cartItems.stream()
                .filter(cartItem -> cartItem.isFor(productCode))
                .findFirst();
    }
}
