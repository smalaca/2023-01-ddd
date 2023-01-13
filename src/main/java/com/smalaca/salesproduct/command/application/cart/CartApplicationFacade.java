package com.smalaca.salesproduct.command.application.cart;

import com.smalaca.salesproduct.command.domain.cart.Cart;
import com.smalaca.salesproduct.command.domain.cart.CartRepository;
import com.smalaca.salesproduct.command.domain.cart.FooBar;

import java.util.List;
import java.util.stream.Collectors;

public class CartApplicationFacade {
    private final CartRepository cartRepository;

    public CartApplicationFacade(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public void addProducts(AddProductsDto dto) {
        // translate input into ubiquitous language (0...*)
        Cart cart = cartRepository.find(dto.getCustomerId());
        List<FooBar> fooBar = dto.getProducts()
                .entrySet()
                .stream()
                .map(entry -> FooBar.create(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());

        // execute method from domain (1)
        cart.add(fooBar);

        // save the result (0/1...*)
        cartRepository.save(cart);
    }
}
