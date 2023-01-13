package com.smalaca.salesproduct.command.domain.offer;

import java.math.BigDecimal;

import com.smalaca.salesproduct.command.application.offer.DeliveryMethod;

public class Offer {

    private DeliveryMethod deliveryMethod;
    private Discount discount;
    private List<OfferItem> offerItems;

}
