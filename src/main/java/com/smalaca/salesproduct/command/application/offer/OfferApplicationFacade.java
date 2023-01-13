package com.smalaca.salesproduct.command.application.offer;

import com.smalaca.salesproduct.command.domain.offer.DeliveryMethod;
import com.smalaca.salesproduct.command.domain.offer.Offer;
import com.smalaca.salesproduct.command.domain.offer.OfferFactory;
import com.smalaca.salesproduct.command.domain.offer.OfferRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OfferApplicationFacade {

    private final OfferRepository offerRepository;

//    private final

    void present(PresentOfferDto presentOfferDto) {
        // translate input into ubiquitous language (0...*)

        DeliveryMethod deliveryMethod = DeliveryMethod.valueOf(presentOfferDto.getDeliveryMethod());
        // execute method from domain (1)

        Offer offer = new OfferFactory().create(deliveryMethod, presentOfferDto.getCouponCode(), presentOfferDto.getProducts());

        // save the result (0/1...*)
        offerRepository.save(offer);
    }

}
