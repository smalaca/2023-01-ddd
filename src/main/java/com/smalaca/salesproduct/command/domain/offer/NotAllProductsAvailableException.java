/* @(#) $$Id$$
 *
 * Copyright (c) 2000-2023 Comarch SA All Rights Reserved. Any usage,
 * duplication or redistribution of this software is allowed only according to
 * separate agreement prepared in written between Comarch and authorized party.
 */
package com.smalaca.salesproduct.command.domain.offer;

import java.util.Set;

/**
 * @author Kamil Fiutek
 */
class NotAllProductsAvailableException extends RuntimeException {
    public NotAllProductsAvailableException(Set<String> keySet, Set<String> keySet1) {

    }
}
