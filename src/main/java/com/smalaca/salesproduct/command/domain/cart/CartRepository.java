package com.smalaca.salesproduct.command.domain.cart;

import java.util.UUID;

public interface CartRepository {
    Cart find(UUID customerId);

    void save(Cart cart);
}
