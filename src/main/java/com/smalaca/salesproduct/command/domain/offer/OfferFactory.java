package com.smalaca.salesproduct.command.domain.offer;

import java.util.Map;

public class OfferFactory {

    private final DiscountService discountService;

    public Offer create(DeliveryMethod deliveryMethod, String couponCode, Map<String, Integer> products) {
        Discount discount = discountService.calculate(couponCode);

        new Offer(deliveryMethod, discount);
    }
}
