package com.smalaca.salesproduct.command.domain.offer;

import java.math.BigDecimal;
import java.util.Map;

public class OfferFactory {

    private final DiscountService discountService;
    private final ProductManagementService productManagementService;

    public Offer create(DeliveryMethod deliveryMethod, String couponCode, Map<String, Integer> products) {
        Discount discount = discountService.calculate(couponCode);
        Map<String, Price> productsToPrices = productManagementService.getPrice(products.keySet());
        Price sum = Price.ZERO;
        for (Map.Entry<String, Price> entry : productsToPrices.entrySet()) {
            String code = entry.getKey();
            Price price = entry.getValue();
            sum = sum.add(price.multiply(products.get(code)));
        }

        new Offer(deliveryMethod, discount);
    }
}
