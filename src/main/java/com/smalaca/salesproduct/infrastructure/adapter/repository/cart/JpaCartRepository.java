package com.smalaca.salesproduct.infrastructure.adapter.repository.cart;

import com.smalaca.salesproduct.command.domain.cart.Cart;
import com.smalaca.salesproduct.command.domain.cart.CartRepository;

import java.util.UUID;

public class JpaCartRepository implements CartRepository {
    @Override
    public Cart find(UUID customerId) {
        if (isCustomerAuthenticated(customerId)) {
            return cartFromMysqlRepositoryFor(customerId);
        }

        if (isCartNotInSessionFor(customerId)) {
            createCartFor(customerId);
        }

        return cartFromSessionFor(customerId);
    }

    @Override
    public void save(Cart cart) {

    }

    private boolean isCustomerAuthenticated(UUID customerId) {
        return false;
    }

    private Cart cartFromMysqlRepositoryFor(UUID customerId) {
//        MysqlCart cart = cartMysqlRepository.findBy(customerId);
//        return cart.asDomainObject();
        return null;
    }

    private boolean isCartNotInSessionFor(UUID customerId) {
        return false;
    }

    private void createCartFor(UUID customerId) {

    }

    private Cart cartFromSessionFor(UUID customerId) {
        return null;
    }
}
