package com.smalaca.salesproduct.command.application.cart;

import com.smalaca.salesproduct.command.domain.cart.Cart;
import com.smalaca.salesproduct.command.domain.cart.CartRepository;

public class CartApplicationFacade {
    private final CartRepository cartRepository;

    public CartApplicationFacade(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public void addProducts(AddProductsDto dto) {
        // translate input into ubiquitous language (0...*)
        Cart cart = cartRepository.find(dto.getCustomerId());

        // execute method from domain (1)
        cart.add(dto.getProducts());

        // save the result (0/1...*)
        cartRepository.save(cart);
    }
}
