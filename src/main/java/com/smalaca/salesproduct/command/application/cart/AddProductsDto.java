package com.smalaca.salesproduct.command.application.cart;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Map;
import java.util.UUID;

@Getter
@RequiredArgsConstructor
public class AddProductsDto {
    private final UUID customerId;
    private final Map<String, Integer> products;
}
