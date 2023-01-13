package com.smalaca.salesproduct.command.domain.offer;

interface DiscountService {
    Discount calculate(String couponCode);
}
