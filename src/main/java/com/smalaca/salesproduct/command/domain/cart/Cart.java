package com.smalaca.salesproduct.command.domain.cart;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

@Entity
public class Cart {
    @Id
    @GeneratedValue
    private UUID id;
    private List<CartItem> cartItems = new ArrayList<>();

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
