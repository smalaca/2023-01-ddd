package com.smalaca.salesproduct.command.domain.offer;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Offer {

    private final DeliveryMethod deliveryMethod;
    private final Discount discount;
    private final List<OfferItem> offerItems;
    private final Price price;

}
