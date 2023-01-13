package com.smalaca.salesproduct.command.domain.offer;

import com.smalaca.salesproduct.command.domain.amount.Amount;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OfferFactory {

    private final DiscountService discountService;
    private final ProductManagementService productManagementService;

    public Offer create(DeliveryMethod deliveryMethod, String couponCode, Map<String, Integer> products) {
        Discount discount = discountService.calculate(couponCode);
        Map<String, Price> availableProductsToPrices = productManagementService.getPriceOfAvailableProducts(products);
        if(!availableProductsToPrices.keySet().containsAll(products.keySet())){
            throw new NotAllProductsAvailableException(products.keySet(), availableProductsToPrices.keySet());
        }
        Price sum = Price.ZERO;
        List<OfferItem> items = new ArrayList<>();
        for (Map.Entry<String, Price> entry : availableProductsToPrices.entrySet()) {
            String code = entry.getKey();
            Price price = entry.getValue();
            Integer amount = products.get(code);
            sum = sum.add(price.multiply(amount));

            OfferItem item = new OfferItem(code, Amount.create(amount), price);
            items.add(item);
        }

        return new Offer(deliveryMethod, discount, items, sum);
    }
}
