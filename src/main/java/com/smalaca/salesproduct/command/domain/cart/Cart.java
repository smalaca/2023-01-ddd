package com.smalaca.salesproduct.command.domain.cart;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Cart {
    @Id
    @GeneratedValue
    private UUID id;
}
