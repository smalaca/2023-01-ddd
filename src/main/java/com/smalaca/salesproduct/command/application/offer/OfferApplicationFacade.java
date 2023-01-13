package com.smalaca.salesproduct.command.application.offer;

import com.smalaca.salesproduct.command.domain.offer.OfferRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OfferApplicationFacade {

    private final OfferRepository offerRepository;

//    private final

    void present(PresentOfferDto presentOfferDto) {
        // translate input into ubiquitous language (0...*)

        // execute method from domain (1)


        // save the result (0/1...*)
//        offerRepository.save();
    }

}
