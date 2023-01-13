package com.smalaca.salesproduct.command.application.offer;

import java.util.Map;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PresentOfferDto {
    private final DeliveryMethod deliveryMethod;
    private final String couponCode;
    private final Map<String, Integer> products;
}
