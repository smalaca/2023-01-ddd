package com.smalaca.salesproduct.command.domain.offer;

import com.smalaca.salesproduct.command.domain.amount.Amount;
import lombok.AllArgsConstructor;

@AllArgsConstructor
class OfferItem {
    private final String productCode;
    private final Amount amount;
    private final Price price;

}
