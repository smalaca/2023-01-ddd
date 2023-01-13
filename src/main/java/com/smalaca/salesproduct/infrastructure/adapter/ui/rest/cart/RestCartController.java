package com.smalaca.salesproduct.infrastructure.adapter.ui.rest.cart;

import com.smalaca.salesproduct.command.application.cart.CartApplicationFacade;

import javax.validation.Valid;
import java.util.UUID;

public class RestCartController {
    private final CartApplicationFacade cartApplicationFacade;

    public RestCartController(CartApplicationFacade cartApplicationFacade) {
        this.cartApplicationFacade = cartApplicationFacade;
    }

    public void addProducts(@Valid ProductsDto dto) {
        cartApplicationFacade.addProducts(dto.asAddProductsDto(customerId()));
    }

    private UUID customerId() {
        // id from auth customer
        // session id
        return null;
    }
}
